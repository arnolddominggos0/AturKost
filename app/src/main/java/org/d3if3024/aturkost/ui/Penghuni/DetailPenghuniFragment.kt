package org.d3if3024.aturkost.ui.Penghuni

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import org.d3if3024.aturkost.databinding.FragmentDetailPenghuniBinding
import org.d3if3024.aturkost.ui.Penghuni.DetailPenghuni.DetailPenghuniFragmentArgs

class DetailPenghuniFragment : Fragment() {
    private lateinit var binding: FragmentDetailPenghuniBinding
    private val args: DetailPenghuniFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailPenghuniBinding.inflate(inflater, container, false)
        binding.namaDetail.text = args.namaDetail
        binding.nomorhpDetail.text = args.nomorHpDetail
        binding.biayaKamarDetail.text = args.biayaKamarDetail

        return binding.root
    }
}
