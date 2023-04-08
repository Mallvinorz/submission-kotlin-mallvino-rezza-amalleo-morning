package kotlinCollection

fun main() {
    val temperatureList = mutableListOf("Celcius", 100, true, 27.9)
    println(temperatureList)

    temperatureList.remove("Celsius")
    temperatureList.set(0, 83)
    temperatureList[1] = 35
    temperatureList.add(3, 56.3)

    println(temperatureList)
}