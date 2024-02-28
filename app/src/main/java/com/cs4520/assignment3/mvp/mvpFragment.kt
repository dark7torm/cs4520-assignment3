package com.cs4520.assignment3.mvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cs4520.assignment3.databinding.FragmentMvpBinding

class MVPFragment : Fragment(), CalculatorContract.View {

    private lateinit var binding: FragmentMvpBinding
    private val presenter = CalculatorPresenter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMvpBinding.inflate(inflater, container, false)
        presenter.attachView(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            addButton.setOnClickListener { presenter.onAddClicked(numberInput1.text.toString(), numberInput2.text.toString()) }
            subtractButton.setOnClickListener { presenter.onSubtractClicked(numberInput1.text.toString(), numberInput2.text.toString()) }
            multiplyButton.setOnClickListener { presenter.onMultiplyClicked(numberInput1.text.toString(), numberInput2.text.toString()) }
            divideButton.setOnClickListener { presenter.onDivideClicked(numberInput1.text.toString(), numberInput2.text.toString()) }
        }
    }

    override fun showResult(result: String) {
        binding.resultDisplay.text = result
        clearInputs()
    }

    override fun showError(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

    override fun clearInputs() {
        binding.numberInput1.text.clear()
        binding.numberInput2.text.clear()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.detachView()
    }
}

