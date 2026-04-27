package oop_00000135652_Ceryne.week10.task

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }
}



