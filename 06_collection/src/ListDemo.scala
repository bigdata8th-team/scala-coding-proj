/**
  * Created by Administrator on 2017/11/10.
  */
object ListDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(1,2,3)
        val list2 = 0::list1
        val list3 = list1.::(0)
        println(list1)
        println(list2)
        println(list3)
        // 把0加到最后
        val list4 = list1 :+ 0
        println(list4)
        println(10 +: list4)
        // 两个list拼接
        val list5 = list1 ++ list2
        println(list5)
        println(list4 :+ 1)
    }
}
