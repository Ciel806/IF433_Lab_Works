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

    println("\n=== Konfigurasi AC & Kabel (run) ===")
    val ac = run{
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)

    val feeder = SmartDevice("Picolo's Auto Feeder","Pet Care", true, 10)
    homeDevices.add(feeder)


    println("\n=== Implement device search with let ===")
    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println("Ditemukan device:")
        println(it.diagnose())
    }

}