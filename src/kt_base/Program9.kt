package kt_base

fun main(){
//    проверяет, является ли введенное пользователем число
//    четным или нечетным. Выведите соответствующее сообщение:

    print("Введите число: ")
    val number = readln().toIntOrNull()

    if (number != null) {
        if (number % 2 == 0) {
            println("Число чётное")
        } else {
            println("Число нечётное")
        }
    } else {
        println("Введено некорректное значение")
    }
}