fun main() {
    val input = "Good Job!"
    val reversedString = reverseString(input)
    println("Original String: $input")
    println("Reversed String: $reversedString")
}
fun reverseString(input: String): String {
    val charArray = input.toCharArray()
    var left = 0
    var right = charArray.size - 1

    while (left < right) {
        val temp = charArray[left]
        charArray[left] = charArray[right]
        charArray[right] = temp
        left++
        right--
    }

    return String(charArray)
}

