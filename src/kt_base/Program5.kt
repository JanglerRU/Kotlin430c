package kt_base

fun main() {
//    получает на вход 5 строк и выводит объединённые строки

    val strings = mutableListOf<String>()

    for (i in 1..5) {
        print("Введите строку $i: ")
        val input = readln()
        strings.add(input)
    }

    val combinedString = strings.joinToString(" ")

    println("Объединённая строка: $combinedString")
}