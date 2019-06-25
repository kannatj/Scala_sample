
// Passing function as paramter and function composition

object Function_2 {
  def main(args:Array[String])={
        function(20,multiBy2)
        functionEx(20,multiBy2(add2(10)))     
  }
  
  def function(a:Int, f:Int => AnyVal) ={
    println(f(a))
  }
  
  def functionEx(a:Int, f:Int)={
    println(a+f) 
  }
  
  def multiBy2(a:Int):Int ={
    a*2
  }
  
  def add2(a:Int):Int={
    a+2
  }
}