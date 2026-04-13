package oop_00000135652_Ceryne.week08.task

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),

        // Corrupted warranty
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),

        // Missing ID!
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),

        // Unknown type
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProducts(raw)

            product?.let {
                println("Processing Product: $it")
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        }
    }
}