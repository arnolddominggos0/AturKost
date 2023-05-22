package org.d3if3024.aturkost.ui.Penghuni.TambahPenghuni

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.d3if3024.aturkost.db.PenghuniDao
import org.d3if3024.aturkost.db.PenghuniEntity

class TambahPenghuniViewModel(private val penghuniDao: PenghuniDao) : ViewModel() {

    fun simpanPenghuni(penghuni: PenghuniEntity) {
        viewModelScope.launch {
            penghuniDao.insert(penghuni)
        }
    }
}
