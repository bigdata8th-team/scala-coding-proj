object ForDemo {
    def main(args: Array[String]): Unit = {
        for (i <- 1 to 5; j <- 2 until 4)
            print(i * j)
        println()
        for (i <- List(1, 2, 3, 4, 5)
             if i % 2 == 0
             if i < 4)
            println(i)

        // 使用yield获得返回值
        val tuples = for {i <- List("hank", "bob", "james"); j <- List(1, 2, 3)} yield (i, j)
        println(tuples)

        val ints = for {i <-  List(1, 2, 3)} yield i * 2
        println(ints)
    }
}
