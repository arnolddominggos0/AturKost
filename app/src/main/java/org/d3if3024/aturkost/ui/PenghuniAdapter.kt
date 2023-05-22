package org.d3if3024.aturkost.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import org.d3if3024.aturkost.R
import org.d3if3024.aturkost.databinding.ListPenghuniBinding
import org.d3if3024.aturkost.db.PenghuniEntity
import org.d3if3024.aturkost.ui.Penghuni.DataPenghuni.DaftarPenghuniFragmentDirections

class PenghuniAdapter : RecyclerView.Adapter<PenghuniAdapter.ViewHolder>() {

    private var penghuniList: List<PenghuniEntity> = emptyList()

    inner class ViewHolder(private val binding: ListPenghuniBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(penghuni: PenghuniEntity) {
            with(binding) {
                namaTextView.text = penghuni.nama
                nomorKamar.text = penghuni.nomorKamar
                iconProfile.setImageResource(penghuni.img)

                root.setOnClickListener {
                    val action =
                        DaftarPenghuniFragmentDirections.actionDaftarPenghuniFragmentToDetailPenghuniFragment(
                            imageIdDetail = R.drawable.baseline_account_circle_24,
                            namaDetail = "John Doe",
                            nomorHpDetail = "081244332112",
                            biayaKamarDetail = "Rp 1.000.000"
                        )
                    itemView.findNavController().navigate(action)
                    it.findNavController().navigate(action)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListPenghuniBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val penghuni = penghuniList[position]
        holder.bind(penghuni)
    }

    override fun getItemCount(): Int {
        return penghuniList.size
    }

    fun setData(data: List<PenghuniEntity>) {
        penghuniList = data
        notifyDataSetChanged()
    }
}









