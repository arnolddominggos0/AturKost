package org.d3if3024.aturkost.ui.Penghuni.TambahPenghuni

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import org.d3if3024.aturkost.databinding.FragmentTambahPenghuniBinding
import org.d3if3024.aturkost.db.AppDb
import org.d3if3024.aturkost.db.Penghuni

class TambahPenghuniFragment : Fragment() {
    private lateinit var binding: FragmentTambahPenghuniBinding
    private lateinit var viewModel: TambahPenghuniViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTambahPenghuniBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = AppDb.getInstance(requireContext())
        val dao = db.dao
        val factory = TambahPenghuniViewModelFactory(dao)
        viewModel = ViewModelProvider(this, factory).get(TambahPenghuniViewModel::class.java)

        binding.btnSimpan.setOnClickListener {
            val nama = binding.namaPenghuniHint.text.toString()
            val nomorKamar = binding.nomorKamarHint.text.toString()
            val nomorHp = binding.nomorPenghuniHint.text.toString()
            val biayaKamar = binding.biayaKamarHint.text.toString()

            val penghuni = Penghuni(
                idPenghuni = 0,
                nama = nama,
                nomorKamar = nomorKamar,
                nomorHp = nomorHp,
                biayaKamar = biayaKamar,
            )

            viewModel.simpanPenghuni(penghuni)

            findNavController().navigateUp()
        }
    }
}
