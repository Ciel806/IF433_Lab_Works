package oop_00000135652_Ceryne.week03.task02

class Player (val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp (amount: Int) {
        if (amount <= 0) {
            println("Hanya menerima angka positif")
            return
        } else {
            val oldLevel = level
            xp += amount
            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}