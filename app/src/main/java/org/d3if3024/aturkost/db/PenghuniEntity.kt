package org.d3if3024.aturkost.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "penghuni")
data class PenghuniEntity(
    @PrimaryKey(autoGenerate = true)
    val idPenghuni: Int = 0,
    val nama: String,
    val nomorKamar: String,
    val nomorHp: String,
    val biayaKamar: String,
    val img: Int
)
