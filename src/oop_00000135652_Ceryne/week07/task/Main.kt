package oop_00000135652_Ceryne.week07.task

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("LEGENDARY Weapon drop chance: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterSword = Weapon.forgeStarterSword()

    println("You've obtained a Starter Weapon!")
    println("Name: ${starterSword.item.name}")
    println("Damage: ${starterSword.item.damage}")
    println("Rarity: ${starterSword.item.rarity}")
    println()
}