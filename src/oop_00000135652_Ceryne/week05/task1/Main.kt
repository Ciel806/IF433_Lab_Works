package oop_00000135652_Ceryne.week05.task1

fun main() {
    val helper = MathHelper()

    val luasPersegi = helper.hitungLuas(12)
    println("Luas persegi: $luasPersegi")

    val luasPersegiPanjang = helper.hitungLuas(23, 12)
    println("Luas persegi: $luasPersegiPanjang")

    val luasLingkaran = helper.hitungLuas(7.0)
    println("Luas Lingkaran: $luasLingkaran")

}