package org.d3if3024.aturkost.ui.Penghuni.DetailPenghuni

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if3024.aturkost.databinding.FragmentDetailPenghuniBinding

class DetailPenghuniFragment : Fragment() {
    private lateinit var binding: FragmentDetailPenghuniBinding
    private lateinit var viewModel: DetailPenghuniViewModel
    private var id: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailPenghuniBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val args = DetailPenghuniFragmentArgs.fromBundle(requireArguments())
        id = args.id

        viewModel.penghuni.observe(viewLifecycleOwner) {
            // Menampilkan data penghuni yang ditemukan
            binding.namaDetail.text = it.nama
            binding.nomorKamarDetail.text = it.nomorKamar
            binding.biayaKamarDetail.text = it.biayaKamar
            binding.nomorhpDetail.text = it.noHp

            // Mengatur aksi untuk tombol edit
            binding.btnEdit.setOnClickListener {
                // Tambahkan aksi untuk tombol Edit
            }

            // Mengatur aksi untuk tombol hapus
            binding.btnHapus.setOnClickListener {
                // Tambahkan aksi untuk tombol Hapus
            }
        }
        }
    }

