package com.cs4520.assignment3.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cs4520.assignment3.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        btnMVP.setOnClickListener {
//            // Navigate to MVPFragment
//            findNavController().navigate(R.id.action_homeFragment_to_MVPFragment)
//        }
//
//        btnMVVM.setOnClickListener {
//            // Navigate to MVVMFragment
//            findNavController().navigate(R.id.action_homeFragment_to_MVVMFragment)
//        }
    }
}
