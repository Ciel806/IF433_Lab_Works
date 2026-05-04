package oop_00000135652_Ceryne.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    //mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama Terdeteksi: $it") //it = name
        it.length //kembaliin nilai expression terkahir
    }
    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        this.length * 2 // 'this' ditambahkan agar konteks length lebih jelas
    }
    println("Hasil kalkulasi run: $result")
}