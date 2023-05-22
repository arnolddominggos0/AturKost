package org.d3if3024.aturkost.model

import java.time.LocalDate

data class Tagihan(
    val id: String,
    val nomorKamar: Int,
    val tanggalTransaksi: LocalDate,
    val jumlahPembayaran: Double
)
