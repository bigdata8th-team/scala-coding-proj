object MethodDemo {
    def add[T](a: String, b: T): String = a + b

    def main(args: Array[String]): Unit = {
        def method(a:Int, b:Int) : Int = a * b
        val func = (a: Int, b: Int) => a * b
        println(method(4, 6))
        println(func(4, 6))
        println(method(func(1, 2), 4))

        println(add("1", 2))
        println(add("gao", "hank"))
    }
}
