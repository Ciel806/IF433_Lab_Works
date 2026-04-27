package oop_00000135652_Ceryne.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generic in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
    
    //multibox
    println("\n=== TEST MULTIPLE PARAMETERS")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    //generic methods
    println("\n=== TEST GENERIC FUNCTIONS ===")
    println(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")

    //numerical storage
    println("\n=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45, 90)}")
}