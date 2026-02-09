package oop_00000135652_Ceryne.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // bersihkan buffer newline (penyakit klasik scanner)

    //validasi di sisi pemanggil (main)
    if (nim.length != 5) {
        println("ERROR: pendaftaran dibatalkan. NIM harus 5 karakter.")
        //program berhenti disini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        //instalasi objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran berhasil")
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        //memanggil primary constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        //memanggil secondary constructor, jurusan otomatis "non-matriculated"
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}
