package oop_00000135652_Ceryne.week05.task2

import oop_00000135652_Ceryne.week05.Admin
import oop_00000135652_Ceryne.week05.Dosen

fun main() {
    val wallet = EWallet("Budi", 50000.0)
    val credit = CreditCard("Budi", 1000000.0)

    val paymentList: List<PaymentMethod> = listOf(wallet, credit)

    println("=== TRANSACTION ACTIVITY ===")
    for (method in paymentList) {
        method.processPayment(75000.0)

        if (method is EWallet) {
            wallet.topUp(50000.0)
            method.processPayment(75000.0)
        }
        println()
    }
}