package oop_00000135652_Ceryne.week02.task02

class Hero (
    val name: String,
    var hp: Int = 100,
    var baseDamage: Int
){
    fun attack(targetName: String) {
        print("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}