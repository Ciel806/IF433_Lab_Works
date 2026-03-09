package oop_00000135652_Ceryne.week06.task

class SmartCCTV (
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("Smart CCTV $name dinyalakan.")
        startRecord()
    }

    override fun turnOff(){
        println("Smart CCTV $name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }
}