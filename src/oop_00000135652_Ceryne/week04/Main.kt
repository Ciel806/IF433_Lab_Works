package oop_00000135652_Ceryne.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() //panggil method milik sendiri
    myCar.honk() // panggil method yang uda di override
    myCar.accelerate() // panggil gabungan method parent dan child

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Wuling", 4, 90)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}