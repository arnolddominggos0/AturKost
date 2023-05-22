package org.d3if3024.aturkost.ui.Penghuni.TambahPenghuni

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if3024.aturkost.db.PenghuniDao

class TambahPenghuniViewModelFactory(private val db: PenghuniDao) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TambahPenghuniViewModel::class.java)) {
            return TambahPenghuniViewModel(db) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
