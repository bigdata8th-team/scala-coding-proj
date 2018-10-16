object TupleDemo {
    def main(args: Array[String]): Unit = {
        val tuples = List(("maoyan", List(10, 3, 5, 0, 7, 0)))
        val map = tuples.map(l => l._1 -> l._2.sortBy(-_)).toMap
        println(map)
    }
}
