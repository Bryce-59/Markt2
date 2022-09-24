package com.example.markt.ui.selling

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.markt.R
import com.example.markt.databinding.FragmentSellingBinding


class SellingFragment : Fragment() {

    private var _binding: FragmentSellingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_selling, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}