package KotlinFundamental

fun main() {

    //Get and Set the Elements of Array
    val kelompok = arrayOf<String>("Kelompok 1", "Kelompok 2", "kelompok 3", "Kelompok 4")

    println(kelompok.get(3))
    println(kelompok[2])
    println("____________________")

    kelompok.set(0, "Kelompok Satu Dong")
    kelompok[2] = "Kelompok Three"

    println(kelompok[2])
    println(kelompok.get(0))
    println("____________________")

    //Primitive type Arrays
    val char = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I')
    char.set(6, 'P')
    char[7] = 'D'

    println(char)

}