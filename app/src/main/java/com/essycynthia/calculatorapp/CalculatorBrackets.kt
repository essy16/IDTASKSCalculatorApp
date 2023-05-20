package com.essycynthia.calculatorapp

import java.util.Collections.copy

sealed class CalculatorBrackets (val symbol: String){
     object OpenBrackets : CalculatorBrackets("(")
     object CloseBrackets : CalculatorBrackets(")")


}
