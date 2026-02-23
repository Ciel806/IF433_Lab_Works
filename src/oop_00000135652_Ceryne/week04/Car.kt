package oop_00000135652_Ceryne.week04

// car "is-A" vehicle. parameter brand dilempar ke atas
open class Car (brand: String, val numberOfDoors: Int) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }
}