package oop_00000135652_Ceryne.week09

fun main() {
    println("=== TEST LIST ===")
    //immutable list: tidak bisa diubah setalh dibuat
    val frameworks: List<String> = listOf("kotlin", "java", "C++")
    //frameworks.add("Python") //ini akan ERROR
    println("Immutable List: $frameworks")

    //mutable list
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}