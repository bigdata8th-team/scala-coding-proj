import scala.collection.mutable.ListBuffer

object ListDemo2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(1,2,3)
        println(list1)

        val list2 = 0::list1
        println(list2)

        val list3 = list1.::(0)
        println(list3)

        println(list1 ++ list2)
        // :::只能用于连接两个list类型的集合
        println(list1 ::: list2)

        val ints = ListBuffer[Int](1,2,3)
        println(ints)
        ints += 4
        ints += 5
        println(ints)
        println(ints :+ 6)

        ints.insert(1, 10,9)
    }
}
