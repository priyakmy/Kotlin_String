import java.util.Scanner

fun main() {
    Scanner(System.`in`).use { scanner ->
        // Take input from the user
        println("Enter a string to reverse:")
        val originalString = scanner.nextLine()

        // Reverse the string
        val reversedStr = reverseString(originalString)

        // Print the original and reversed strings
        println("Original string: $originalString")
        println("Reversed string: $reversedStr")
    }
}

fun reverseStr(str: String): String {
    var reversed = ""
    for (i in str.length - 1 downTo 0) {
        reversed += str[i]
    }
    return reversed
}
