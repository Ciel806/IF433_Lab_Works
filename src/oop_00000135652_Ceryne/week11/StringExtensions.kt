package oop_00000135652_Ceryne.week11

//extension function dengan receiver'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

//extensiokn function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}