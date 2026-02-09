package oop_00000135652_Ceryne.week02

class Student (
    val name: string,
    val nim: string,
    var major: String
){
    init {
        //vaidasi sederhana: cek panjang nim
        if (nim.length != 5) {
            println("Warning: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}