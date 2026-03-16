package oop_00000135652_Ceryne.week07.task

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword() : Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Dagger of Antares", 220, ItemRarity.EPIC)
            return Weapon(item, 500)
        }
    }
}