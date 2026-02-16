package oop_00000135652_Ceryne.week03

fun main() {
    val e = Employee("Budi")

    //1. test validasi salary
    // e.salary = -1000 // harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. test encapsulation
    e.increasePerformance()
    //e.performanceRating = 5 // kalo uncomment = MERAH

    //3. test computed property
    println("Pajak yang harus dibayar: ${e.tax}")
}