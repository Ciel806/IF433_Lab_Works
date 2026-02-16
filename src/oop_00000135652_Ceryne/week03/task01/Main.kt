package oop_00000135652_Ceryne.week03.task01

fun main () {
    val w = Weapon("EXCALIBURRR?!?!?!")

    w.damage = -50
    w.damage = 9999

    println("--- Weaponary ---")
    println("Name: ${w.name}")
    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")
}