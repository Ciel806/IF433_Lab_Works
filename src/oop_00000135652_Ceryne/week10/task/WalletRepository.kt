package oop_00000135652_Ceryne.week10.task

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }

    fun findByName(query: String): T? {
        return items.find { item ->
            if (item is Coin) {
                item.name.equals(query, ignoreCase = true)
            } else {
                false
            }
        }
    }
}



