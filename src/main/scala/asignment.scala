class Asignment {

  def maximum (number : List[Int]) =
  {
    val sorted_list= number.sorted
    val a = number.size-1
    val max_elem=sorted_list(a)
    print(s" maximum element $max_elem")

  }

  def productandsum ( number : Int ) = {
      var f=1
      var sumofdigits=0
      for { x<-1 to number }
        yield (f=f * x)
      println(s"Product of a number is $f")
      while(f!=0)
     { val remainder= f % 10
       sumofdigits=sumofdigits + remainder
       f=f/10
     }
    println(s"sum of the digits $sumofdigits")

    }


  def fibonaci(number : Int) : Int = {
    if (number == 1)
    {  number
    }
    else
      fibonaci(number-1) + fibonaci(number-2)
  }


  def interpol (number : List[Int])  =
  {
    for{ x<-number }
      yield
        println(s"${number.indexOf(x)}   $x")

  }
}

object assignment {
  def main(args: Array[String]) = {
    val number = 5
    val List1 = List(6, 5, 0, 10, 8, 76, 9)
    val object1 = new Asignment()
    object1.interpol(List1)
    object1.productandsum(number)
    object1.maximum(List1)
  }
}
