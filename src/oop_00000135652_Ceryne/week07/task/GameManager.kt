package oop_00000135652_Ceryne.week07.task

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}

