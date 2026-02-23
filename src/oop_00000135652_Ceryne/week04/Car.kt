package oop_00000135652_Ceryne.week04

// car "is-A" vehicle. parameter brand dilempar ke atas
open class Car (brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }

    override fun honk() {
        println("TIN TI! Mobil $brand lewat!")
    }
}