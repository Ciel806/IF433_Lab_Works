package oop_00000135652_Ceryne.week03.task01

class Weapon (val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("damage must not be negative")
            } else if (value > 1000) {
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() =
            if (damage > 800) {
                "LEGENDARY"
            } else if (damage > 500) {
                "EPIC"
            } else {
                "COMMON"
            }
}