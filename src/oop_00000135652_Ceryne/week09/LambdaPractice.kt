package oop_00000135652_Ceryne.week09

fun main() {
    println("=== TEST LAMBDA ===")
    //syntax lambda eksplisit: { parameters -> body }
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    //lambda dengan satu parameter bisa mengguankan implicit 'it'
    val squareimplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareimplicit(4)}")

}