package com.essycynthia.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.essycynthia.calculatorapp.ui.theme.*
import java.nio.file.Paths.get

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorAppTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    calculatorUI()

                }
            }
        }
    }

    @Preview
    @Composable
     fun calculatorUI() {
        val viewModel = viewModel<CalculatorViewModel>()
        val state = viewModel.state
        val buttonSpacing = 8.dp
        Box(
            Modifier
                .background(MaterialTheme.colors.background)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                verticalArrangement = Arrangement.spacedBy(buttonSpacing),
            ) {
                Text(
                    text =

                    (state.openBrackets?.symbol ?: "") +
                            state.number1 +
                            (state.operation?.symbol ?: "") +
                            state.number2 +
                            (state.closeBrackets?.symbol ?: ""),
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 32.dp),
                    fontWeight = FontWeight.Light,
                    fontSize = 80.sp,
                    color = MaterialTheme.colors.primary,
                    maxLines = 2
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "C", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Cadmium_Yellow
                    ) {
                        viewModel.onAction(CalculatorAction.Clear)

                    }
                    CalculatorButton(
                        symbol = "(", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = peach
                    ) {
                        viewModel.onAction(
                            CalculatorAction.Brackets(
                                CalculatorBrackets.OpenBrackets
                            )
                        )
                    }
                    CalculatorButton(
                        symbol = ")", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = peach
                    ) {
                        viewModel.onAction(
                            CalculatorAction.Brackets(
                                CalculatorBrackets.CloseBrackets
                            )
                        )
                    }
                    CalculatorButton(
                        symbol = "/", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Light_Violet
                    ) {
                        viewModel.onAction(
                            CalculatorAction.Operation(
                                CalculatorOperation.Divide
                            )
                        )

                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "7", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(7))

                    }
                    CalculatorButton(
                        symbol = "8", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(8))

                    }
                    CalculatorButton(
                        symbol = "9", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(9))

                    }
                    CalculatorButton(
                        symbol = "*", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Light_Violet
                    ) {
                        viewModel.onAction(
                            CalculatorAction.Operation(
                                CalculatorOperation.Multiply
                            )
                        )

                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "4", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(4))

                    }
                    CalculatorButton(
                        symbol = "5", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(5))

                    }
                    CalculatorButton(
                        symbol = "6", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(6))

                    }
                    CalculatorButton(
                        symbol = "+", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Light_Violet
                    ) {
                        viewModel.onAction(
                            CalculatorAction.Operation(
                                CalculatorOperation.Add
                            )
                        )

                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "1", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(1))

                    }
                    CalculatorButton(
                        symbol = "2", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(2))

                    }
                    CalculatorButton(
                        symbol = "3", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(3))

                    }
                    CalculatorButton(
                        symbol = "-", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Light_Violet
                    ) {
                        viewModel.onAction(
                            CalculatorAction.Operation(
                                CalculatorOperation.Subtract
                            )
                        )

                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = ".", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Decimal)

                    }
                    CalculatorButton(
                        symbol = "0", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Color.White
                    ) {
                        viewModel.onAction(CalculatorAction.Number(0))

                    }
                    CalculatorButton(
                        symbol = "DEL", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Bright_purple
                    ) {
                        viewModel.onAction(CalculatorAction.Delete)

                    }
                    CalculatorButton(
                        symbol = "=", modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f), color = Light_Violet
                    ) {
                        viewModel.onAction(CalculatorAction.Calculate)

                    }

                }


            }


        }
    }
}



