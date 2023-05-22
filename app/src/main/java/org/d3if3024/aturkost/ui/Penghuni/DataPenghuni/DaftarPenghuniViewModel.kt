package org.d3if3024.aturkost.ui.Penghuni.DataPenghuni

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if3024.aturkost.db.AppDb
import org.d3if3024.aturkost.db.PenghuniDao
import org.d3if3024.aturkost.model.PenghuniKos

class DaftarPenghuniViewModel(private val penghuniDao: PenghuniDao) : ViewModel() {

    private val _penghuniList = MutableLiveData<List<PenghuniKos>>()

    private fun getDataFromDataSource(): List<PenghuniKos> {
        return listOf(
            PenghuniKos(1, "Asep Cilembu", "Kamar No. 45", 1),
            PenghuniKos(2, "Asep Baik", "Kamar No. 35", 2)

        )
    }
}
