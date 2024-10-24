package kt_base
fun main(){
//    Вводится строка, программу, удаляет из нее первые два
//    элемента и вставляет их в конец

    println("Введите строку: ")
    val input = readln()

    if (input.length >= 2) {
        val firstTwoChars = input.take(2)

        val modifiedString = input.drop(2) + firstTwoChars

        println("Изменённая строка: $modifiedString")
    } else {
        println("Строка должна содержать как минимум два символа.")
    }
}