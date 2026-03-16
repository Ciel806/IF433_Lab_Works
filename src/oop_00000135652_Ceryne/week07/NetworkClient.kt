package oop_00000135652_Ceryne.week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id" //shared content

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_LINE: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}