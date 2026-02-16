package oop_00000135652_Ceryne.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            //kode dibawah ini salah dan bahaya
            // kita panggil setter di dalam setter (recursive)
            this.salary = value
        }
}