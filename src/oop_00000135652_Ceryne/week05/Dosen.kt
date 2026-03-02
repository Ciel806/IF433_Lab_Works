package oop_00000135652_Ceryne.week05

class Dosen (nama: String, val nidn: String) : Pegawai(nama) {
    //WAJIB dioverride karena fungsi bekerja() bersifat abstract di parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }

    //fungsi unik/spesifik yang hanya dimiliki dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}