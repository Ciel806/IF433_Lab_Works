package oop_00000135652_Ceryne.week06.task

class SmartHomeHub () {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    //Buat fungsi turnOffAllSwitches(). Lakukan iterasi for ke devices. Gunakan
    //Smart Casting (is) untuk mendeteksi: Jika device tersebut adalah sebuah
    //Switchable, panggil turnOff().
    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }

}