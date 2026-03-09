package oop_00000135652_Ceryne.week06

import kotlin.math.tan

interface PaymentMethod {
    fun pay(amount: Double)
}

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank for Rp$amount")
    }
}