object SeqDemo {
    def main(args: Array[String]): Unit = {
        val ci = Option.empty[String]
        val seq = ci.map(v => v).map("ci" -> _).map(v => v).toSeq
        println(seq)
        println(seq.isEmpty)
    }
}
