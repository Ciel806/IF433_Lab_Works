package oop_00000135652_Ceryne.week01

fun main() {
    val gameTitle = "Wuthering Waves"
    val price = 250000

    val finalPrice = calculateDiscount(price)

    println("Game: $gameTitle")
    println("Original Price: $price")
    println("Final price: $finalPrice")

}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.8).toInt()
    else (price *0.9).toInt()