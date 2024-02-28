package com.cs4520.assignment3.mvp

class CalculatorPresenter : CalculatorContract.Presenter {
    private var view: CalculatorContract.View? = null
    override fun attachView(view: CalculatorContract.View?) {
        this.view = view
    }

    override fun detachView() {
        view = null;
    }

    override fun onAddClicked(num1: String, num2: String) {
        try {
            val result = num1.toDouble() + num2.toDouble()
            view?.showResult(result.toString())
        } catch (e: NumberFormatException) {
            view?.showError("Invalid input")
        }
    }

    override fun onSubtractClicked(num1: String, num2: String) {
        try {
            val result = num1.toDouble() - num2.toDouble()
            view?.showResult(result.toString())
        } catch (e: NumberFormatException) {
            view?.showError("Invalid input")
        }
    }

    override fun onMultiplyClicked(num1: String, num2: String) {
        try {
            val result = num1.toDouble() * num2.toDouble()
            view?.showResult(result.toString())
        } catch (e: NumberFormatException) {
            view?.showError("Invalid input")
        }
    }

    override fun onDivideClicked(num1: String, num2: String) {
        try {
            if (num2.toDouble() == 0.0) {
                view?.showError("Cannot divide by zero")
            } else {
                val result = num1.toDouble() / num2.toDouble()
                view?.showResult(result.toString())
            }
        } catch (e: Exception) {
            view?.showError("Invalid input")
        }
    }
}