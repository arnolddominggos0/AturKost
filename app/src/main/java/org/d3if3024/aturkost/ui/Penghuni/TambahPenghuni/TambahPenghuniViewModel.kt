package org.d3if3024.aturkost.ui.Penghuni.TambahPenghuni


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.d3if3024.aturkost.db.Penghuni
import org.d3if3024.aturkost.db.PenghuniDao

class TambahPenghuniViewModel(private val penghuniDao: PenghuniDao) : ViewModel() {

    val daftarPenghuni: LiveData<List<Penghuni>> = penghuniDao.getAllPenghuni()

    fun simpanPenghuni(penghuni: Penghuni) {
        viewModelScope.launch {
            penghuniDao.insert(penghuni)
        }
    }
}





