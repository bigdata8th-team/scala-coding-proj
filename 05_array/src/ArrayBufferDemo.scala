import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {
    def main(args: Array[String]): Unit = {
        // 变长数组
        val buf = ArrayBuffer[Int]()
        buf += 1
        println(buf)
        buf += (5,3,8)
        println(buf)
        buf ++= Array(8,9)
        println(buf)
        buf ++= ArrayBuffer(6,7)
        println(buf)
        buf.insert(0, 3, 3, 3)
        println(buf)
        buf.remove(0, 2)
        println(buf)
    }
}
