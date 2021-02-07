import scala.util.Random

object progCode extends App {

  val digits = List.fill(100)(Random.between(0, 30))

  def last(digitList: List[Int]): Int = {
    val count = digitList.length - 1
    digitList(count)
  }

  println(digits)
  println(last(digits))
}
