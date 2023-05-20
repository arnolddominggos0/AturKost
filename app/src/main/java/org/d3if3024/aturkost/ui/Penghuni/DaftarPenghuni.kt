package org.d3if3024.aturkost.ui.Penghuni

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if3024.aturkost.databinding.FragmentDaftarPenghuniBinding


class DaftarPenghuni: Fragment(){

    private lateinit var binding: FragmentDaftarPenghuniBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDaftarPenghuniBinding.inflate(inflater, container, false)
        return binding.root
    }
}