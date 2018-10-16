object ZipDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(1,2,3)
        val list2 = List('a', 'b')
        println(list1.zip(list2))
        println(list1.zip(list2).zipWithIndex)
        println("123".r)
        println(list1.foldLeft(5)(_+_))
    }
}
