package grokking

fun main() {
    println(uppercase("teste", 0))
}

fun uppercase(s: String, index: Int): String {
    var text = s.toCharArray()

    if (index >= s.length) {
        return s
    }

    var i = index + 1
    val upper: String = text[index].uppercase()
    text[index] = upper.single()

    return uppercase(String(text), i)

}