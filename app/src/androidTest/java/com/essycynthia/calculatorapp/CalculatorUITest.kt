package com.essycynthia.calculatorapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.essycynthia.calculatorapp.ui.theme.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//This indicates that the tests are to be run with an Android JUnit runner and not with a regular JUnit runner.
@RunWith(AndroidJUnit4::class)
class CalculatorUITest {
    @get:Rule
    //createComposeRule is required because it provides us access to our composable components
    val composeTestRule = createComposeRule()

    @Test
    fun calculatorUI_ShouldDisplayNumber_WhenButtonClicked() {
        composeTestRule.setContent {
            CalculatorAppTheme() {
                calculatorUI()



            }
        }
        composeTestRule.onNodeWithText("1").performClick()
    }

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