import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if3024.aturkost.model.PenghuniKos

class DaftarPenghuniViewModel : ViewModel() {

    private val _penghuniList = MutableLiveData<List<PenghuniKos>>()
    val penghuniList: LiveData<List<PenghuniKos>>
        get() = _penghuniList

    fun loadPenghuniData() {
        val data = getDataFromDataSource()

        _penghuniList.postValue(data)
    }

    private fun getDataFromDataSource(): List<PenghuniKos> {
        return listOf(
            PenghuniKos(1, "Asep Cilembu", "Kamar No. 45", "500.000", "0812521871231")
        )
    }
}
