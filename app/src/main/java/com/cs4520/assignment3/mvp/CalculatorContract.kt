package com.cs4520.assignment3.mvp


interface CalculatorContract {
    interface View {
        fun showResult(result: String)
        fun showError(message: String)
        fun clearInputs()
    }

    interface Presenter {
        fun attachView(view: View?)
        fun detachView()
        fun onAddClicked(num1: String, num2: String)
        fun onSubtractClicked(num1: String, num2: String)
        fun onMultiplyClicked(num1: String, num2: String)
        fun onDivideClicked(num1: String, num2: String)
    }

}

