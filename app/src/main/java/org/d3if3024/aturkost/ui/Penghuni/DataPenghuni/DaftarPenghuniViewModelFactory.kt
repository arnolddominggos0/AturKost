package org.d3if3024.aturkost.ui.Penghuni.DataPenghuni

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if3024.aturkost.db.PenghuniDao

class DaftarPenghuniViewModelFactory (
    private val db : PenghuniDao
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DaftarPenghuniViewModel::class.java)) {
            return DaftarPenghuniViewModel(db) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }
}