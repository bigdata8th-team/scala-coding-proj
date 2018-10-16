/**
  * Created by Administrator on 2017/11/12.
  */

// 用隐式转换加强现有类
// 类型没有方法的时候会尝试隐式转换
class SuperMan(val name:String) {
    def emitLaster = println(s"name=$name")
}

class Man(val name:String)
object ImplicitDemo1 {
    implicit def man2superMan(man:Man):SuperMan = new SuperMan(man.name)

    def main(args: Array[String]): Unit = {
        val tom = new Man("TOM")
        tom.emitLaster
    }
}
