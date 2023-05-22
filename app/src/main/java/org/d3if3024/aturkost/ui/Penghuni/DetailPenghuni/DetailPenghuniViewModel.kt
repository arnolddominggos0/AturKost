package org.d3if3024.aturkost.ui.Penghuni.DetailPenghuni

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if3024.aturkost.model.PenghuniKos

class DetailPenghuniViewModel : ViewModel() {
    private val _penghuni = MutableLiveData<PenghuniKos>()
    val penghuni: LiveData<PenghuniKos>
        get() = _penghuni

    fun setPenghuni(data: PenghuniKos) {
        _penghuni.value = data
    }

    fun getPenghuniById(data: PenghuniKos){
        _penghuni.value = data
    }
}
