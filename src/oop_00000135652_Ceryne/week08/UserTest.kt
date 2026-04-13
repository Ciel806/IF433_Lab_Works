package oop_00000135652_Ceryne.week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)

    //di unit testing, jika user null, kita harap testnya gagal (crash)
    //maka penggunaan !! sangat lazim di file testing
    val initial = testUser!!.name.substring(0, 1)

    //check() adalah fungsi bawaan kotlin untuk assertion
    check(initial == "T") { "Test Failed! Initial is wrong." }
    println("Test Passed: initial is T")
}