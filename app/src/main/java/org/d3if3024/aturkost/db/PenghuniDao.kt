package org.d3if3024.aturkost.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PenghuniDao {
    @Insert
    fun insert(bmi: Penghuni)

    @Query("SELECT * FROM penghuni ORDER BY id DESC LIMIT 1")
    fun getLastBmi(): LiveData<Penghuni?>

    @Query("SELECT * FROM penghuni")
    fun getAllPenghuni(): LiveData<List<Penghuni>>

    @Query("SELECT * FROM penghuni WHERE id = :id")
    fun getPenghuniById(id: Long): LiveData<Penghuni>
}
