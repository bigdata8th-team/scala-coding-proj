//闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。

//闭包通常来讲可以简单的认为是可以访问一个函数里面局部变量的另外一个函数。

object ClosureDemo {
    def main(args: Array[String]): Unit = {
        val factor = 3
        val mut = (i:Int) => i * factor
        println(mut(2))
    }
}
