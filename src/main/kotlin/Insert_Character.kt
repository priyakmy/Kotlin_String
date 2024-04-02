import java.lang.StringBuilder
fun main() {
    val str = "Piku"
    val index = 4
    val char = "S"


    val sb = StringBuilder(str)
    sb.insert(index, char)
    val resultingString = sb.toString()
    println(resultingString)
}