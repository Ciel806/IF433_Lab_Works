package oop_00000135652_Ceryne.week13.task
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord (val id: Int, val symbol: String,
                        val type: String, val margin: Double,
                        val pnl: Double)

fun TradeRecord.toCsv(): String = "$id, $symbol, $margin, $pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).writeText(trades.joinToString("\n") { it.toCsv() })
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main(){
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 500.0, 150.25),
        TradeRecord(2, "ETHUSDT", "Short", 250.0, -45.10)
    )
    saveTrades(trades, path = "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }
}