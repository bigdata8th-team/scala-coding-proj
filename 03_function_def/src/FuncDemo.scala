object FuncDemo {
    def main(args: Array[String]): Unit = {
        // val 函数名 = 函数参数列表 => 函数体
        val func = (x:Int, y:Int) => x + y
        println(func(4, 7))

        // 匿名函数
        val range = 1 to 10
        println(range.map(v => v * 10))
        println(range.map(_ * 10))
    }
}
