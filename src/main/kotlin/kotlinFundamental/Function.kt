package kotlinFundamental

fun main() {
    val hasil = luasSegitiga(6, 12)

    println(hasil)
}

fun luasSegitiga(alas: Int, tinggi: Int): Int{
    return alas * tinggi / 2
}