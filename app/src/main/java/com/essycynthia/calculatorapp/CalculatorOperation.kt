package com.essycynthia.calculatorapp

sealed class CalculatorOperation(val symbol: String) {
    object Add : CalculatorOperation("+")
    object Multiply : CalculatorOperation("*")
    object Divide : CalculatorOperation("/")
    object Subtract : CalculatorOperation("-")


}
