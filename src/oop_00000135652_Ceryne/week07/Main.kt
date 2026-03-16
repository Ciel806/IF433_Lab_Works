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

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) //otomatis readable format
    println("Sama? ${data1 == data2}") //true

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // destructuring decalarion
    println("Destructured: $userName berumur $userAge")
}