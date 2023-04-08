package kotlinCollection

fun main() {
    val groupMap = mapOf(
        1 to "Fender Stratocaster",
        2 to "Fender Telecaster",
        3 to "Squier Stratocaster",
        4 to "Squier Telecaster",
        5 to "Fender Jaguar",
        6 to "Squier Jaguar",
        7 to "Takamine",
        8 to "Taylor",
    )

    println(groupMap)

    val mutable = groupMap.toMutableMap()
    println(mutable)

    mutable[3] = "Schecter Nick Johnston"
    mutable.put(9, "Yamaha")

    println(mutable)
}