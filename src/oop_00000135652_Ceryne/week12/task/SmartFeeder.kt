package oop_00000135652_Ceryne.week12.task

fun dispenseKibble(requestGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }
}