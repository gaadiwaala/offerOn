package com.example.offeron.ui.privacypolicy

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.offeron.R

class privacypolicy : Fragment() {

    companion object {
        fun newInstance() = privacypolicy()
    }

    private lateinit var viewModel: PrivacypolicyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.privacypolicy_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PrivacypolicyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}