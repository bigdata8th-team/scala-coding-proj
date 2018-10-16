import scala.collection.mutable

object MapDemo {
    def main(args: Array[String]): Unit = {
        val map1 = new mutable.HashMap[String, Int]()
        map1("spark") = 1
        println(map1)
        map1 += (("hadoop", 2), ("hive", 3))
        map1.put("strom", 4)
        map1.remove("hadoop")
        println(map1)
        map1 -= "hive"
        println(map1)

        val scores = mutable.Map("tom" -> 80, "hank" -> 90, "james" -> 99)
        println(scores)
        // 创建映射的另外一种方法
        println(scores("tom"))
        println(scores.getOrElse("hank", 0))

        // 修改key对应的值
        // 需要导包才能修改
        scores("james") = 100
        println(scores("james"))
    }
}
