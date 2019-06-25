
// Lambda function
object Function_3 {
  def main(args: Array[String])={
      var result = (a:Int,b:Int) => a+b
      var result1 =(_:Int)+(_:Int)
      println(result(1,2))
      println(result1(2,3))
  }
}