package com.cs4520.assignment3.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.cs4520.assignment3.databinding.FragmentMvvmBinding

class MVVMFragment : Fragment() {

    private var _binding: FragmentMvvmBinding? = null
    private val binding get() = _binding!!
    private val viewModel: CalculatorViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMvvmBinding.inflate(inflater, container, false)
        viewModel.result.observe(viewLifecycleOwner, Observer { result ->
            binding.resultDisplay.text = result
            clearInputs()
        })
        viewModel.errorMessage.observe(viewLifecycleOwner, Observer { errorMessage ->
            errorMessage?.let {
                Toast.makeText(context, errorMessage, Toast.LENGTH_SHORT).show()
                viewModel.clearErrors()
            }
        })

        setupClickListeners()
        return binding.root
    }

    private fun setupClickListeners() {
        with(binding) {
            addButton.setOnClickListener { viewModel.calculate("add", numberInput1.text.toString(), numberInput2.text.toString()) }
            subtractButton.setOnClickListener { viewModel.calculate("subtract", numberInput1.text.toString(), numberInput2.text.toString()) }
            multiplyButton.setOnClickListener { viewModel.calculate("multiply", numberInput1.text.toString(), numberInput2.text.toString()) }
            divideButton.setOnClickListener { viewModel.calculate("divide", numberInput1.text.toString(), numberInput2.text.toString()) }
        }
    }

    private fun clearInputs() {
        binding.numberInput1.text.clear()
        binding.numberInput2.text.clear()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
