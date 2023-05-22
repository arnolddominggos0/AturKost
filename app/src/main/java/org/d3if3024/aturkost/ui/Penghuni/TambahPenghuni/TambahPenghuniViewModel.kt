package org.d3if3024.aturkost.ui.Penghuni.TambahPenghuni

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.d3if3024.aturkost.db.Penghuni
import org.d3if3024.aturkost.db.PenghuniDao

class TambahPenghuniViewModel(private val penghuniDao: PenghuniDao) : ViewModel() {

    fun simpanPenghuni(penghuni: Penghuni) {
        viewModelScope.launch {
            penghuniDao.insert(penghuni)
        }
    }
}
