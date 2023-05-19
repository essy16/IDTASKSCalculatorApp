package com.essycynthia.calculatorapp

 sealed class CalculatorBrackets (val symbol: String){
     object OpenBrackets : CalculatorBrackets("(")
     object CloseBrackets : CalculatorBrackets(")")

}
