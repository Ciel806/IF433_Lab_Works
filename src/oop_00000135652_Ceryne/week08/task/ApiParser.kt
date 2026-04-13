package oop_00000135652_Ceryne.week08.task

class ApiParser {
    fun parseProducts(rawJson: Map<String, Any?>): Product? {
        val id = rawJson["id"] as? String ?: throw IllegalArgumentException("API Invalid: Missing ID")
        val name = rawJson["name"] as? String ?: throw IllegalArgumentException("API Invalid: Missing Name")
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }
}