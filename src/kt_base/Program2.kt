package kt_base

fun main(){
//    проверяет, является ли введенный символ буквой,
//    выводя true или false
    println("Введите ваш символ: ")
    val input = readln()

    if (input.length == 1) {
        val symbol = input[0]
        val result = symbol.isLetter()
        println(result)
    } else {
        println("Пожалуйста, введите один символ.")
    }
}