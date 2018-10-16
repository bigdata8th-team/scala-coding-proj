import scala.util.Random

class CaseDemo2 {
    def main(args: Array[String]): Unit = {
        val arr = Array(1.3,2,"nihao", null)
        println(arr)
        val m = arr(Random.nextInt(4))

        m match {
            case a:String=>println("String" + a)
            case b:Int=>println("Int :" + b)
            case c:Double=>println("Double :" + c)
            case _ =>println("none")
        }
    }
}
