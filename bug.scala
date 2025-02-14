```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor

  def myMethod(x: Int): Int = {
    if (x > value) {
      x + value
    } else {
      throw new IllegalArgumentException("x must be greater than value") //Exception thrown here
    }
  }
}

object Main extends App {
  val obj = new MyClass()
  println(obj.myMethod(1)) //This will print 1, if this is intended behaviour the exception is okay
  println(obj.myMethod(-1)) // This will throw an exception
}
```