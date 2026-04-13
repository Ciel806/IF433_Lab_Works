package oop_00000135652_Ceryne.week08.task

sealed class Product

data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()
data class Clothing(val id: String, val name: String, val size: String) : Product()