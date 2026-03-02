package oop_00000135652_Ceryne.week05.task2

class CreditCard (accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            println("SUCCESS! Used amount: $usedAmount")
        } else {
            println("Transaksi Ditolak!")
        }
    }
}