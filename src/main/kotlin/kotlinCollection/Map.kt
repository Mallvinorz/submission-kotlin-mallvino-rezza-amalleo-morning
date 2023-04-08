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
    println(groupMap[7])
    println(groupMap.getValue(4))
    println(groupMap.values)
    println(groupMap.keys)
}