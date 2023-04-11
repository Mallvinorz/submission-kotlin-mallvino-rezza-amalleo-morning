package kotlinFundamental

fun main() {
    //Safe calls & Elvis Operator
    var dateIn: String? = null
    var statusKamar = "Booked"

    statusKamar = "Check In"

    if (statusKamar.equals("Check In")) {
        dateIn = "11/4/2023 16:16:10 WIB"

        println(dateIn)
    }
}