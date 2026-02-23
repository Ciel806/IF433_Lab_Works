package oop_00000135652_Ceryne.week04.task2

class Manager (name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}