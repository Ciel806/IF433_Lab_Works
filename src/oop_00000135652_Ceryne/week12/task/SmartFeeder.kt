package oop_00000135652_Ceryne.week12.task

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, requestedGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN 1 ===")
    try {
        dispenseKibble(80, currentKibbleStock, false)
        println("Sisa Stok: $currentKibbleStock")
    } catch (e: DispenserJamException) {
        println("ERROR DISPENSER: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ERROR STOK: ${e.message}")
    } catch (e: Exception) {
        println("ERROR: $e")
    }

    finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }


    println("\n=== JADWAL MAKAN 2 ===")
    runCatching { dispenseKibble(30, 1000, false) }
        .onSuccess {
            newStock -> currentKibbleStock = newStock
            println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
        }
        .onFailure {
            error -> println("peringatan ke Pemilik: ${error.message}")
        }

}