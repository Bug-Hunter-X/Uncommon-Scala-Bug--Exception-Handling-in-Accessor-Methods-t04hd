```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age

  def age_=(newAge: Int): Unit = {
    try {
      if (newAge < 0) throw new IllegalArgumentException("Age cannot be negative")
      _age = newAge
    } catch {
      case e: IllegalArgumentException => println(s"Error setting age: "+ e.getMessage)
      //Or you could re-throw the exception, log it, or use a default value
    }
  }
}

val myInstance = new MyClass("John")
myInstance.age = 30
myInstance.age = -5 //This will print an error message instead of crashing
```