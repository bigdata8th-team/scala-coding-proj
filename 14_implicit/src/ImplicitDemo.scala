/**
  * Created by Administrator on 2017/11/12.
  */

// TYPE
object  type1 {
    implicit val food = "banana"
    implicit val num = 84
}
object ImplicitDemo {
    def eat()(implicit food:String = "chiken") :Unit = {
        println(s"$food delicious")
    }

    def main(args: Array[String]): Unit = {
        eat()
        import type1._
        eat()
        eat()("apple")
    }
}

// def 方法要求我们传入一个隐式参数，一旦把门面倒进来，他就会在门面中找类型一致的