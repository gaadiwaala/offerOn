package com.example.offeron.ui.mycoupans

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.offeron.R

class mycoupans : Fragment() {

    companion object {
        fun newInstance() = mycoupans()
    }

    private lateinit var viewModel: MycoupansViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mycoupans_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MycoupansViewModel::class.java)
        // TODO: Use the ViewModel
    }

}