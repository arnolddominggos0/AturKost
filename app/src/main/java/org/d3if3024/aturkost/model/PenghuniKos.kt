package org.d3if3024.aturkost.model

import java.time.LocalDate

data class PenghuniKos(
    val id: Int,
    val nama: String,
    val alamat: String,
    val nomorTelepon: String,
    val nomorKamar: Int,
    val biayaKamar: Double,
    val tanggalMasuk: LocalDate
)
