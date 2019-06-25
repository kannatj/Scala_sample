
object Function_1 {
   def main(args: Array[String])={
         println("Inside Main")
         var result = function_1()
         println(result)
         function_2(2,3)
         function_3("kanna")
         function_4("passing 2 values",1,2)
         function_4("passing 1 value",1)       
   }
   
   //without argument
   def function_1()={
          var a = 10
          println("Function_1")
          a
   }
   
   //Passing two Int arguments
   def function_2(a:Int, b:Int)={
     println("Function_2")
     println(a+b)
   }
   
   //Passing String arguments 
   def function_3(Str:String)={
       println("Function_3")
       println("hello this is "+Str)
   }
   
   //Assigning default values to arguments
   def function_4(str:String,a:Int =0,b:Int =0)={
         println("Function_4")
         print(str)
         println(" "+(a+b))
       }
 }
