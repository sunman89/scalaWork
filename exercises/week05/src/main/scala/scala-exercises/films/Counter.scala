package films

/**
  * Created by Sonny on 27/05/2017.
  */
case class Counter(count : Int = 0) {

  def inc(n : Int = 1) : Counter = { copy(count + n) }

  def dec(n : Int = 1) : Counter = { copy(count - n) }

  def adjust(adder : Adder) : Counter = { copy(adder.add(count))}

}

class Adder(amount : Int) {
  def add(in : Int) : Int = in + amount
}
