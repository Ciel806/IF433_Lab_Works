package oop_00000135652_Ceryne.week09.task

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String)