class CaseDemo4 {
    def main(args: Array[String]): Unit = {
        val list = List(0,2,4,5)
        list match {
            case 0 :: Nil => println("只有一个0")
            case x :: y :: Nil => println(s"x: $x y:$y")
            case 0 :: tail => println("除了0还有其他的" + tail)
        }
    }
}
