package oop_00000135652_Ceryne.week04.task2

fun main() {
    println("--- Hierarki Karyawan ---")

    val manager = Manager("Kevin", 3000000)
    val developer = Developer("May", 5000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()} \n")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}