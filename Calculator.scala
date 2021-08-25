package model

class Calculator {

  def calculate(number1: Long, number2: Long, operator: String): Float =
    operator match {
      case "+" => number1 + number2
      case "-" => number1 - number2
      case "*" => number1 * number2
      case "/" =>
        if (number2 == 0) 0
        number1 / number2
      case _ => 0

    }

}  

