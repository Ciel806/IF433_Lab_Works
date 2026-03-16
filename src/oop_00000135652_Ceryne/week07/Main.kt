package oop_00000135652_Ceryne.week07

fun main() {
    println("=== TEST SIGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() //instansi lewat factory
    client.connect()
}