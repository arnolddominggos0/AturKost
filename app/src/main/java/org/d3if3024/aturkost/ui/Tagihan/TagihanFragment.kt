package org.d3if3024.aturkost.ui.Tagihan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if3024.aturkost.databinding.FragmentTagihanBinding

class TagihanFragment: Fragment() {

    private lateinit var binding: FragmentTagihanBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTagihanBinding.inflate(inflater, container, false)
        return binding.root
    }
}