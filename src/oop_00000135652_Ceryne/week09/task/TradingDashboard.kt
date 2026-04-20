package oop_00000135652_Ceryne.week09.task

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 25.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 15, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 8.4, "CLOSED"),
        TradeLog("ADAUSDT", "LONG", 2, -2.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val topPerformerString = winningTrades
        .sortedByDescending { it.roe }
        .map { println("WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)") }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { println("LOSS [${it.pair} - ${it.position}]: -${it.leverage}% (Lev: ${it.leverage})") }

}