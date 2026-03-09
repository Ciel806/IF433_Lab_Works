package oop_00000135652_Ceryne.week06

class Smartphone : Camera, Phone {
    //manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() //jalanin logika kamera
        super<phone>.turnOn() //jalanin logika phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}