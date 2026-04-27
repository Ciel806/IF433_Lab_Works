package oop_00000135652_Ceryne.week10.task

fun main() {
    val coinRepo = WalletRepository<Coin>()

    //isi data
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 1.2))
    coinRepo.add(Coin("USDT", 100.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 0.1))
    txRepo.add(Transaction("TX002", 50.5))
}