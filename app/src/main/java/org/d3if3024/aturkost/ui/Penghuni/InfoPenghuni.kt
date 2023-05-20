package org.d3if3024.aturkost

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if3024.aturkost.databinding.FragmentInfoPenghuniBinding

class InfoPenghuni: Fragment(){

    private lateinit var binding: FragmentInfoPenghuniBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentInfoPenghuniBinding.inflate(inflater, container, false)
        return binding.root
    }
}

