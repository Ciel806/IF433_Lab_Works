package oop_00000135652_Ceryne.week02.task01

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI LOAN ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.next()

    print("Masukkan Durasi Pinjam: ")
    var loanDuration = scanner.nextInt()

    scanner.nextLine() // bersihkan buffer newline (penyakit klasik scanner)

    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("--- Detail Peminjaman Buku ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Nama Peminjam: ${loan.borrower}")
    println("Durasi Peminjam: ${loan.loanDuration} hari")
    println("Total denda: ${loan.calculateFine()}")

}
