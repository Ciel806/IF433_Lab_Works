package oop_00000135652_Ceryne.week06.task

fun main () {
    val Lamp = SmartLamp("1", "Ruang Tamu")
    val Speaker = SmartSpeaker("1", "Google Nest Dapur")
    val CCTV = SmartCCTV("1", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(Lamp)
    hub.addDevice(Speaker)
    hub.addDevice(CCTV)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}