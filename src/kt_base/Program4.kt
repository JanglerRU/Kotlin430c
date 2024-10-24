package kt_base

fun main(){
//    считывает символ в нижнем регистре, преобразовывает его в
//    верхний, а затем выводит код Unicode нового символа

    println("Введите символ в нижнем регистре: ")
    val input = readln()

    if (input.length == 1 && input[0].isLowerCase()) {
        val lowerCaseSymbol = input[0]
        val upperCaseSymbol = lowerCaseSymbol.uppercaseChar()
        val unicode = upperCaseSymbol.code

        println("Верхний регистр: $upperCaseSymbol")
        println("Unicode кода нового символа: $unicode")
    } else {
        println("Пожалуйста, введите один символ в нижнем регистре.")
    }
}