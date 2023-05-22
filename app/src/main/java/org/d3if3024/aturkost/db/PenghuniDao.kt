package org.d3if3024.aturkost.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PenghuniDao {
    @Insert
    fun insert(penghuni: PenghuniEntity)

    @Query("SELECT * FROM penghuni ORDER BY idPenghuni DESC")
    fun getLasPenghuni(): LiveData<List<PenghuniEntity?>>

    @Query("DELETE FROM penghuni")
    fun clearData()
}
