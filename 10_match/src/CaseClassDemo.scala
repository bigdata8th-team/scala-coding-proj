import scala.actors.Actor

/**
  * case class不是普通的类
  * 而是专门做样例匹配的类
  */
case class Register(username : String, password : String)
case class Login(username : String, password : String)

class HelloActor extends Actor {
    override def act : Unit = {
        while (true) {

            /*
            当使用receive时，程序为每个actor都单独创建一个线程，如没有接收到消息，该线程也会一直保持等待，不可以其他任务复用。
当使用react时，actor不会单独占用线程，只有当接收到消息程序才会为该actor分配线程，非常节省资源。
但毫无疑问，使用react时每接受到一条消息都需要重新分配线程和进行初始化工作，所以会有一定的延迟，这在实际应用中也需要进行权衡。
以下代码展示了上述的区别：WRActor和LRActor分别代表了两种接收消息的模式，WRActor接收每条消息都新建了一个线程，而LRActor接收所有消息都复用了相同的线程。
             */
            receive {
                case Login(username, password) => println("Login" + username + ":" + password)
                case Register(username, password) => println("Register" + username + ":" + password)
            }
        }
    }
}

/**
  * Created by Administrator on 2017/11/12.
  */
object HelloActor {
    def main(args: Array[String]): Unit = {
        val helloActor = new HelloActor
        helloActor.start()
        helloActor ! Register("tom", "123")
    }
}
