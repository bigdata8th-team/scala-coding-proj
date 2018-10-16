import scala.util.Random

object CaseDemo extends App {
    val arr = Array("mc", "chang", "shi")
    val name = arr(Random.nextInt(arr.length))
    println("你好".head)
    println("123".head)
    println(arr.mkString(","))
    name match {
        case "mc" => println("spark")
        case "chang" => println("j2ee")
        case "shi" => println("hadoop")
        case _ => println("没有这个老师")
    }

    private val arrMap: Map[Char, String] = arr.map(v => (v.head, v)).toMap
    arrMap.foreach {
        case (x, y) => println(x + y)
    }
}
