package oop_00000135652_Ceryne.week02.task02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Enter your hero name: ")
    val heroName = scanner.nextLine()

    print("Enter Damage number: ")
    var damage = scanner.nextInt()

    scanner.nextLine() // bersihkan buffer newline (penyakit klasik scanner)

    val hero = Hero(heroName, baseDamage = damage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0){
        println("Menu:")
        println("1. Serang")
        println("2. Kabur")
        println("Choice: ")

        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            println("${hero.name} attacks Enemy!")
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy attack ${hero.name}")
                hero.takeDamage(enemyDamage)
                println("HP musuh tersisa: $enemyHp")
                println("HP ${hero.name} tersisa: ${hero.hp}")
            }

        } else if (choice == 2) {
            print("${hero.name} kabur dari pertarungan!")
        } else {
            print("Invalid choice!")
        }
    }

    println("--- Combat Result ---")
    if (hero.isAlive()) {
        println("$heroName Wins!!")
    } else if (!hero.isAlive()) {
        println("You lost!")
    } else {
        println("It's a tie!")
    }
}
