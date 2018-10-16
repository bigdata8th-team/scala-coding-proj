import scala.collection.mutable._

object ArrayDemo {
    def main(args: Array[String]): Unit = {
        val arr1 = new Array[Int](8)
        println(arr1.length)
        println(arr1.toBuffer)
        // Array[Int](8) <==> Array(8)
        val arr2 = Array[Int](8)
        println(arr2.length)
        println(arr2.toBuffer)
        val arr3 = Array(1,2,3)
        println(arr3.length)
        println(arr3(1))

        val arr = Array(1,2,3,4,5,6,7)
        for (elem <- arr) {
            print(elem)
        }

        for (elem <- arr.reverse) {
            println(elem)
        }

        for (i <- arr.indices) {
            print(arr(i))
        }

        val a = arr.sorted.reverse
        println(a.sum)

        a.filter(_%2 == 0).map(_*10)
        println(a.toBuffer)

        println(arr.sortWith((a, b) => a > b).toBuffer)
        println(arr(0))
    }
}
