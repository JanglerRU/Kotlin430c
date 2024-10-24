package kt_base

fun main(){
//    принимает на вход целое число от 1 до 7 и выводит на экран
//    день недели:

    print("Введите число от 1 до 7: ")
    val dayNumber = readln().toIntOrNull()

    if (dayNumber != null) {
        when (dayNumber) {
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
            else -> println("Некорректный ввод: введите число от 1 до 7")
        }
    } else {
        println("Некорректный ввод: введите целое число")
    }
}