package oop_00000135652_Ceryne.week06

interface Clickable {
    val name: String //abstract property, tidak ada nilai default
    fun click()
}

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}