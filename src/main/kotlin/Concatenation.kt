import java.lang.StringBuilder

fun main(){
    var text="Welcome Priya"
    var text2="Keep going on"
    println(text + text2) // By using Plus operator
    println("$text$text2") // By using string templates

    // Using Sting Builder
    val text3=StringBuilder()
    text3.append(text).append(text2)
    val c= text3.toString()

    println(c)
}