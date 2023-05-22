package org.d3if3024.aturkost.ui.Penghuni.DataPenghuni

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if3024.aturkost.db.PenghuniDao
import org.d3if3024.aturkost.model.PenghuniKos

class DaftarPenghuniViewModel(private val penghuniDao: PenghuniDao) : ViewModel() {

    private val _penghuniList = MutableLiveData<List<PenghuniKos>>()
    val penghuniList: LiveData<List<PenghuniKos>>
        get() = _penghuniList

    fun loadPenghuniData() {
        val data = getDataFromDataSource()
        _penghuniList.value = data
    }

    private fun getDataFromDataSource(): List<PenghuniKos> {
        return listOf(
            PenghuniKos(1, "Asep Cilembu", "Kamar No. 45", "500.000", "0812521871231"),
            PenghuniKos(2, "Asep Baik", "Kamar No. 35", "800.000", "08125218712241")

        )
    }
}
