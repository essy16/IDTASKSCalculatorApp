package com.essycynthia.calculatorapp

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
//    val operation: List<CalculatorOperation?> = emptyList()

)
