package org.d3if3024.aturkost.ui.Penghuni

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if3024.aturkost.databinding.FragmentTambahPenghuniBinding

class TambahPenghuni: Fragment(){

    private lateinit var binding: FragmentTambahPenghuniBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTambahPenghuniBinding.inflate(inflater, container, false)
        return binding.root
    }
}
