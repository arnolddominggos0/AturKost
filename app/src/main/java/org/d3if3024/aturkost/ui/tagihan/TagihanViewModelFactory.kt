package org.d3if3024.aturkost.ui.tagihan

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if3024.aturkost.db.PenghuniDao

class TagihanViewModelFactory (
    private val db : PenghuniDao
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TagihanViewModel::class.java)) {
            return TagihanViewModel(db) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }
}