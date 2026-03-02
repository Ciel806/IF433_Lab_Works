package oop_00000135652_Ceryne.week05.task2

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}