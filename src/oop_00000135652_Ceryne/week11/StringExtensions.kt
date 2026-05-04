package oop_00000135652_Ceryne.week11

//extension function dengan receiver'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

//extensiokn function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    // 'this' bisa bernilai null, jadi harus ditangani
    return this == null || this.isEmpty()
}