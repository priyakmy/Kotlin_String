fun main() {
    println("Enter a string:")
    val inputString = readLine() ?: ""

    println("Enter a character to count:")
    val characterToCount = readLine()?.firstOrNull() ?: '\u0000'

    val count = countOccurrences(inputString, characterToCount)

    println("Occurrences of '$characterToCount' in '$inputString': $count")
}

fun countOccurrences(inputString: String, charToCount: Char): Int {
    var count = 0
    for (char in inputString) {
        if (char == charToCount) {
            count++
        }
    }
    return count
}
