package org.d3if3024.aturkost.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "penghuni")
data class Penghuni(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nama: String,
    val nomorKamar: String,
    val nomorHp: String,
    val biayaKamar: String
)
