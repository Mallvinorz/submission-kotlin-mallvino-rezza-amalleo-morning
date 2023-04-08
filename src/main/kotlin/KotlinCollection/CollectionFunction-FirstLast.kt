package KotlinCollection

fun main() {
    val guitar = arrayOf("Fender Stratocaster", "Fender Telecaster", "Squier Stratocaster",
        "Squier Telecaster", "Fender Jaguar", "Squier Jaguar", "Takamine", "Taylor",)

    val firstGuitar = guitar.first()
    val lastGuitar = guitar.last()

    println("$firstGuitar, $lastGuitar")
}