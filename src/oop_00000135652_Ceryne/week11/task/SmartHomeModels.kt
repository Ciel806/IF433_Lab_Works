package oop_00000135652_Ceryne.week11.task

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)