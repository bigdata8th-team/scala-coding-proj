class CaseDemo3 {
    def main(args: Array[String]): Unit = {
        val arr = Array(1,3,5)
        arr match {
            case Array(1,x,y) => println(x + " " + y)
            case Array(0) => println("只有一个0")
            case Array(1, _*) => println("1和其他")
            case _=> println("其他")
        }

        val tup = (1, 1.3, "hello")
        tup match {
            case (1, x, y) => println(s"x:$x y:$y")
            case (_, 9, "aaa") => println("123")
            case _ => println("qita")
        }
    }

}
