package oop_00000135652_Ceryne.week10.task

fun main() {
    val coinRepo = WalletRepository<Coin>()

    //isi data
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 1.2))
    coinRepo.add(Coin("USDT", 100.0))
}