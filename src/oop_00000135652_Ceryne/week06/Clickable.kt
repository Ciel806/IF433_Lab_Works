package oop_00000135652_Ceryne.week06

interface Clickable {
    // ERROR: property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    //function without body (Implicitly Abstract)
    fun click()
}