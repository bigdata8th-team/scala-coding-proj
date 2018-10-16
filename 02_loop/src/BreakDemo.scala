import scala.util.control.Breaks

object BreakDemo {
    def main(args: Array[String]): Unit = {
        // 创建 Breaks 对象
        val loop = new Breaks

        loop.breakable {
            for (i <- 1 to 10) {
                println(i)
                if (i == 7)
                    loop.break
            }
        }

        innerBreak()
    }

    def innerBreak(): Unit = {
        val numList1 = List(1,2,3,4,5)
        val numList2 = List(11,12,13)

        val outer = new Breaks
        val inner = new Breaks

        // 内部中断不会退出整个外部循环
        outer.breakable {
            for( a <- numList1){
                println( "Value of a: " + a )
                inner.breakable {
                    for( b <- numList2){
                        println( "Value of b: " + b )
                        if( b == 12 ){
                            inner.break
                        }
                    }
                } // 内嵌循环中断
            }
        } // 外部循环中断
    }
}
