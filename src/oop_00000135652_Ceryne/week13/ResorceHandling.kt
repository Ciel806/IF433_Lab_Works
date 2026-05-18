package oop_00000135652_Ceryne.week13

import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    //buka stream scr manual
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    //BAHAYA: jika terjadi exception di baris ini (misalnya pembagian dengan nol atau error tak terduga)
    //program akan crash dan metode writer.close() dibawahnya TIDAK AKAN PERNAH TERKSEKUSI
    //file akan terus terkunci oleh OS

    writer.close()
    println("Proses penulisan unsafe selesai.")

    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log entry #$i: System status OK")
        }
    }
    println("100 baris log berhasil digenerate dengan sangat aman.")


    println("\n=== TEST BUFFERED READER ===")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach { line ->
            println("Stream Read: $line")
        }
    }
}