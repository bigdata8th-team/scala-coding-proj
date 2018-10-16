object FoldLeftDemo {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)
        println(list.foldLeft(5)(_ + _))
    }
}
