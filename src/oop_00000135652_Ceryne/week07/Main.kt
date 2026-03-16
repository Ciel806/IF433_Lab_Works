package oop_00000135652_Ceryne.week07

fun main() {
    println("=== TEST SIGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() //instansi lewat factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegulerUser("Alice", 22)
    val reg2 = RegulerUser("Alice", 22)
    println(reg1) //cetak memori hash
    println("Sama? ${reg1 == reg2}") // false
}