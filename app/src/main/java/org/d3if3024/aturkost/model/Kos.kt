package org.d3if3024.aturkost.model

data class Kos(
    val id: Int,
    val nama: String,
    val alamat: String,
    val harga: Double,
    val fasilitas: List<String>,
    val deskripsi: String
)
