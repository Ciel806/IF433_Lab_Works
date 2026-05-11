package oop_00000135652_Ceryne.week12

class InsufficientFundsException (
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")