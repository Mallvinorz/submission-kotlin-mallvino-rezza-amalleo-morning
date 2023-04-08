package kotlinFundamental

fun main() {
    //format waktu 24 jam
    val timeRequired = 4
    val timeStart = 12
    val timeArrive = timeRequired + timeStart
    val timeNow = 14


    val statusPerjalanan = if (timeNow < timeStart) {
        "Kamu belum memulai perjalanan"
    } else if (timeNow < timeArrive) {
        "Kamu sedang dalam perjalanan"
    } else {
        "Kamu sudah sampai"
    }

    println(statusPerjalanan)
    println("_________________________")

    val a = 12
    val b = 36
    val hasil = if (a * 2 < b) "2a lebih kecil daripada b"
    else "2a lebih besar atau sama dengan b"
    println("Hasil $hasil")
}