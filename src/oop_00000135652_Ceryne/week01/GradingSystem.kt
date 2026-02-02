package oop_00000135652_Ceryne.week01

fun main() {
    // REFACTOR: gunakan val dan hapus tipe data eksplisit
    val name: String = "John Thor"
    val score: Int = 80

    //refactor: String template ($name)
    println("Nama: $name, score: $score")

    //tambahkan dibawah println
    val grade = when (score) {
        in 90 ≤ .. ≤ 100 -> "A"
        in 80 ≤ .. ≤ 89 -> "B"
        in 70 ≤ .. ≤ 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
}

//tulis diluar main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"