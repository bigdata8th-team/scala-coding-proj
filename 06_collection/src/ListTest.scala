/**
  * Created by Administrator on 2017/11/11.
  */
object ListTest {
    val list = List("hello tom hello jerry", "hello tom hell jay hello bob")

    def main(args: Array[String]): Unit = {
        val lines = list.map(_.split(" ")).flatten
        val stringses = list.map(_.split(" "))
        println(stringses.head.toBuffer)
        println(lines)
        // 形成元组
        val lines1 = list.flatMap(_.split(" ")).map((_,1))
        println(lines1)
        // 按照键值分组
        val group = lines1.groupBy(_._1)
        println(group)
        val grouped = group.mapValues(_.foldLeft(0)(_+_._2))
        println(grouped)
        val result = group.map(x =>( x._1, x._2.size))
        println(result)
        val sort = result.toList.sortBy(_._2)
        println(sort)
    }
}
