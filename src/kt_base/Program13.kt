package kt_base

fun main(){
//    Реализовать обратный отсчет до старта, пользователь
//    вводит число. Должна быть проверка.

    print("Введите начальное число для обратного отсчета: ")
    val start = readln().toIntOrNull()

    if (start != null && start > 0) {
        for (i in start downTo 1) {
            println(i)
            Thread.sleep(1000)
        }
        println("Старт!")
    } else {
        println("Введите корректное положительное число больше 0")
    }
}