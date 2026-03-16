package oop_00000135652_Ceryne.week07.task

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("LEGENDARY Weapon drop chance: ${ItemRarity.LEGENDARY.dropChance}%\n")

    val starterSword = Weapon.forgeStarterSword()

    println("You've obtained a Starter Weapon!")
    println("Name: ${starterSword.item.name}")
    println("Damage: ${starterSword.item.damage}")
    println("Rarity: ${starterSword.item.rarity}")
    println()

    val upgradedItem = starterSword.item.copy(
        damage = 25
    )

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}