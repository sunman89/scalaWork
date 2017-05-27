package films

/**
  * Created by Sonny on 27/05/2017.
  */
case class Person(first : String, last : String) {

}

object Person{
  def apply(name : String): Person = {
    val parts = name.split(" ")
    new Person(parts(0), parts(1))
  }
}
