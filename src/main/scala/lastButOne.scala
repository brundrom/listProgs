import scala.util.Random

object lastButOne extends App {

  val digits = List.fill(30)(Random.between(0, 30))

  def penultimate(digitList: List[Int]): Int = {
    val count = digitList.length - 2
    digitList(count)
  }

  println(digits)
  println(penultimate(digits))
}
