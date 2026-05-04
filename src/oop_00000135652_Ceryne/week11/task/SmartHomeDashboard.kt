package oop_00000135652_Ceryne.week11.task

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    println("=== Konfigurasi Pencahayaan (apply & also) ===")
    val lampu = SmartDevice().apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        println("Name: ${it.name}\nCategory: ${it.category}\n" +
                "isOnline: ${it.isOnline}\nPowerLoad: ${it.powerLoad}")
        homeDevices.add(it)
    }

    println("\n=== Konfigurasi Keamanan (also) ===")
    val camera = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

}