package kt_base

fun main(){
//    находит среднее арифметическое трёх введённых чисел с
//    плавающей точкой
    println("Введите ваши числа: ")

    val number1 = readln().toDoubleOrNull()
    val number2 = readln().toDoubleOrNull()
    val number3 = readln().toDoubleOrNull()

    if (number1 != null && number2 != null && number3 != null)
        println("Среднее арифмитическое 9ваших чисел: " + (number1 + number2 + number3) / 2)
    else
        println("Вы ввели некоректные данные")
}