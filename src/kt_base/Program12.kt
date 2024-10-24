package kt_base

fun main(){
//    Вводится число, программа должна выводит удвоенные
//    числа от 1 до n (обе границы не включены в диапозон)

    print("Введите число N: ")
    val n = readln().toIntOrNull()

    if (n != null && n >= 1) {
        println(n * 2)
    } else {
        println("Введите корректное число больше 2")
    }
}
