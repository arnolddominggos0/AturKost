package org.d3if3024.aturkost.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "penghuni_kos")
data class PenghuniKos(
    @PrimaryKey val id: Int,
    val nama: String,
    val nomorKamar: String,
    val biayaKamar: String,
    val noHp: String,
)


