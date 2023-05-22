package org.d3if3024.aturkost.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PenghuniDao {
    @Insert
    fun insert(bmi: Penghuni)

    @Query("SELECT * FROM penghuni ORDER BY idPenghuni DESC LIMIT 1")
    fun getLastBmi(): LiveData<Penghuni?>

    @Query("SELECT * FROM penghuni")
    fun getAllPenghuni(): LiveData<List<Penghuni>>

    @Query("SELECT * FROM penghuni WHERE idPenghuni = :id")
    fun getPenghuniById(id: Long): LiveData<Penghuni>

    @Query("DELETE FROM penghuni")
    fun clearData()
}
