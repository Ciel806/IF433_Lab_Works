package oop_00000135652_Ceryne.week07.task

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("You've encountered a Monster!")
        }

        is BattleState.LootDropped -> {
            println("You've obtained a loot!")
            println("\nName: ${event.item.name}")
            println("\nDamage: ${event.item.damage}")
            println("\nRarity: ${event.item.rarity}")
        }

        is BattleState.GameOver -> {
            println("GAME OVER!")
            println("Reason: ${event.reason}")
        }

        is BattleState.SafeZone -> {
            println("You've entered a SAFE ZONE!")
        }
    }
}