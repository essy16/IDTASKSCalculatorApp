package com.essycynthia.calculatorapp

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val openBrackets: CalculatorBrackets? = null,
    val closeBrackets: CalculatorBrackets? = null,
    val operation: CalculatorOperation? = null

)
