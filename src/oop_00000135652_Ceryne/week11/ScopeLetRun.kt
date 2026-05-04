package oop_00000135652_Ceryne.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    //mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama Terdeteksi: $it") //it = name
        it.length //kemabliin nilai expression terkahir
    }
    println("Panjang nama: $length")
}