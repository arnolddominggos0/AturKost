package org.d3if3024.aturkost.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.d3if3024.aturkost.R
import org.d3if3024.aturkost.databinding.ListPenghuniBinding
import org.d3if3024.aturkost.db.Penghuni
import org.d3if3024.aturkost.model.PenghuniKos

class PenghuniAdapter :
    ListAdapter<PenghuniKos, PenghuniAdapter.ViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK =
            object : DiffUtil.ItemCallback<PenghuniKos>() {
                override fun areItemsTheSame(
                    oldItem: PenghuniKos, newItem: PenghuniKos
                ): Boolean {
                    return oldItem.id == newItem.id
                }

                override fun areContentsTheSame(
                    oldItem: PenghuniKos, newItem: PenghuniKos
                ): Boolean {
                    return oldItem == newItem
                }
            }
    }

    private var onItemClickListener: ((PenghuniKos) -> Unit)? = null


    class ViewHolder(
        private val binding: ListPenghuniBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(penghuni: Penghuni) = with(binding) {
            namaTextView.text = penghuni.nama
            nomorKamar.text = penghuni.nomorKamar
            binding.iconProfile.setImageResource(R.drawable.baseline_account_circle_24)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListPenghuniBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val penghuni = getItem(position)
        holder.bind(Penghuni(penghuni.id, penghuni.nama, penghuni.nomorKamar, penghuni.noHp, penghuni.biayaKamar))
    }

    fun setOnItemClickListener(listener: (PenghuniKos) -> Unit) {
        onItemClickListener = listener
    }
}







