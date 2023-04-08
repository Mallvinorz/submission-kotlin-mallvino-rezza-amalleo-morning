package KotlinControlFlow

fun main() {
    //format waktu 24 jam
    val waktuDibutuhkan = 7
    val waktuMulai = 8
    val waktuKedatangan = waktuMulai + waktuDibutuhkan
    val waktuSekarang = 7


    val status = if (waktuMulai > waktuSekarang) {
        "Kamu belum memulai perjalanan"
    } else if (waktuKedatangan > waktuSekarang) {
        "Kamu sedang dalam perjalanan"
    } else {
        "Kamu sudah sampai"
    }

    println(status)
}