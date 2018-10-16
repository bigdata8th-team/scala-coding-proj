/**
  * Created by Administrator on 2017/11/12.
  */
// 特殊售票窗口
// 类型不对会尝试类型转换
class SpecialPerson(val name:String) {
    println("123")
}
class Student1(val name:String) {

}
class Older(val name:String)

class Yong(val name:String)


object Implicit3 {
    implicit def object2SpecialPerson(obj:Object) : SpecialPerson = {
        if (obj.getClass == classOf[Student1]) {
            val stu = obj.asInstanceOf[Student1]
            new SpecialPerson(stu.name)
        } else if (obj.getClass == classOf[Older]) {
            val older = obj.asInstanceOf[Older]
            new SpecialPerson(older.name)
        } else {
            null
        }

    }

    var ticketNum = 0
    def buySpecialTicket(p:SpecialPerson) = {
        ticketNum += 1
        "T-" + ticketNum
    }

    def main(args: Array[String]): Unit = {
        val haha = new Student1("123")
        println(buySpecialTicket(haha))
        val hank = new Student1("456")
        println(buySpecialTicket(hank))

    }
}
