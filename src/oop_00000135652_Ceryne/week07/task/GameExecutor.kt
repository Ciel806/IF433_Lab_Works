package oop_00000135652_Ceryne.week07.task

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("You've encountered ${event.monsterName}!")
            println()
        }

        is BattleState.LootDropped -> {
            println("You've obtained a loot!")
            println("Name: ${event.item.name}")
            println("Damage: ${event.item.damage}")
            println("Rarity: ${event.item.rarity}")
            println()
        }

        is BattleState.GameOver -> {
            println("GAME OVER!")
            println("Reason: ${event.reason}")
            println()
        }

        is BattleState.SafeZone -> {
            println("You've entered a SAFE ZONE!")
            println()
        }
    }
}