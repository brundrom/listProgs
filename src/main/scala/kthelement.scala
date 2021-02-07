import scala.util.Random

object kthelement extends App {

  val digits = List.fill(30)(Random.between(0, 30))

  def nth(number: Int, digitList: List[Int]): Int = {
    digitList(number - 1)
  }

  def length(digitList: List[Int]): Int = {
    digitList.length
  }

  println(digits)
  println(nth(6, digits))
  println(length(digits))
}
