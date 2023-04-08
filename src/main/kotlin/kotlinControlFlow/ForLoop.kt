package kotlinControlFlow

fun main() {
//    Using range expression
    for (a in 1..5) {
        println(a)
    }
    println("________________________________")

//    Iterate array
    val menu = arrayOf("Sirloin Steak", "Tenderloin Steak",
                        "Chicken Steak", "Dori Steak")

    for (showMenu in menu ) {
        println(showMenu)
    }
    println("________________________________")

//    With Index
    val menuDua = arrayOf("Sirloin Steak", "Tenderloin Steak",
                "Chicken Steak", "Dori Steak")
    for ((index, value ) in menuDua.withIndex()) {
        println("Index $index. $value")
    }
    println("________________________________")

//    For Each
    val menuTiga = arrayOf("Sirloin Steak", "Tenderloin Steak",
                            "Chicken Steak", "Dori Steak")
    menuTiga.forEach { value ->
        println("Nama Makanan : $value")
    }
    println("________________________________")

//    For Each Indexed
    val menuEmpat = arrayOf("Sirloin Steak", "Tenderloin Steak",
                            "Chicken Steak", "Dori Steak")
    menuEmpat.forEachIndexed { index, value ->
        println("Makanan dengan index $index adalah $value")
    }
}