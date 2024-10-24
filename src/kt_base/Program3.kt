package kt_base

fun main(){
//    преобразует два введённых символа в Unicode и выводит их
//    разность

    println("Введите первый символ: ")
    val firstInput = readln()

    println("Введите второй символ: ")
    val secondInput = readln()

    if (firstInput.length == 1 && secondInput.length == 1) {
        val firstSymbol = firstInput[0]
        val secondSymbol = secondInput[0]

        val firstUnicode = firstSymbol.code
        val secondUnicode = secondSymbol.code

        val difference = firstUnicode - secondUnicode

        println("Unicode первого символа: $firstUnicode")
        println("Unicode второго символа: $secondUnicode")
        println("Разность Unicode: $difference")
    } else {
        println("Пожалуйста, введите по одному символу.")
    }

}