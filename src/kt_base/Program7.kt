package kt_base

fun main(){
//    реализовать программу которая безопасно вызовет
//    свойство length на строке и выведет результат, если строка не null.

    println("Введите строку (может быть пустой или null): ")
    val input: String? = readlnOrNull()

    val length = input?.length ?: "Строка равна null"

    println("Длина строки: $length")
}