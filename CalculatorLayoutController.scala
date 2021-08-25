package view

import scalafx.event.ActionEvent
import scalafx.scene.control.{Label, Button}
import scalafxml.core.macros.sfxml
import model.Calculator

@sfxml
class CalculatorLayoutController (
    
    private var result: Label,

    private var number1: Long = 0,

    private var operator: String = "",

    private var start: java.lang.Boolean = true,

    private var model: Calculator = new Calculator()

  ) {

    def processNumbers(event: ActionEvent): Unit = {

        if (start) {
        result.setText("")
        start = false
        }

        val value: String = event.getSource.asInstanceOf[Button].getText
        result.setText(result.getText + value)
    }

    def processOperators(event: ActionEvent): Unit = {

        val value: String = event.getSource.asInstanceOf[Button].getText
        if (value.!=("=")) {
        if (!operator.isEmpty) return
        operator = value
        number1 = java.lang.Long.parseLong(result.getText)
        result.setText("")
        } 
        
        else {
        if (operator.isEmpty) return
        val number2: Long = java.lang.Long.parseLong(result.getText)
        val output: Float = model.calculate(number2, number2, operator)
        result.setText(String.valueOf(output))
        operator = ""
        start = true
        }
    }

}

