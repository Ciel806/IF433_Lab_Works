package oop_00000135652_Ceryne.week05.task2

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Transaksi Berhasil! Sisa saldo: $balance")
        }
        else {
            println("Transaksi Gagal! Saldo tidak cukup!")
        }
    }

    fun topUp (amount: Double) {
        balance += amount
        println("Top Up Berhasil! Saldo: $balance")
    }
}
