package com.cs4520.assignment3.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    private val _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result

    private val _errorMessage = MutableLiveData<String?>()
    val errorMessage: LiveData<String?> = _errorMessage

    fun calculate(operation: String, num1: String, num2: String) {
        try {
            val operand1 = num1.toDouble()
            val operand2 = num2.toDouble()

            val calculationResult = when (operation) {
                "add" -> operand1 + operand2
                "subtract" -> operand1 - operand2
                "multiply" -> operand1 * operand2
                "divide" -> if (operand2.toDouble() == 0.0) {
                    _errorMessage.value= "Cannot divide by zero"
                    null
                } else {
                    operand1 / operand2
                }
                else -> {
                    _errorMessage.value = "Invalid operation"
                    null
                }
            }

            calculationResult?.let {
                _result.value = it.toString()
            }
        } catch (e: NumberFormatException) {
            _errorMessage.value = "Invalid input"
        }
    }

    fun clearErrors() {
        _errorMessage.value = null;
    }
}