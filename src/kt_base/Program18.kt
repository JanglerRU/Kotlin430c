package kt_base

fun main(){
//    На вход программе подаётся число n и n элементов первого множества,
//    каждый на новой строке. Затем число m и m элементов второго
//    множества, каждый на новой строке. Напишите программу, которая
//    создаёт два множества из данных элементов и возвращает их общие
//    элементы

    print("Введите количество элементов первого множества: ")
    val n = readln().toIntOrNull()

    print("Введите количество элементов второго множества: ")
    val m = readln().toIntOrNull()

    if (n != null && n > 0 && m != null && m > 0) {
        val firstSet = mutableSetOf<String>()
        for (i in 1..n) {
            print("Введите элемент первого множества №$i: ")
            firstSet.add(readln())
        }

        val secondSet = mutableSetOf<String>()
        for (i in 1..m) {
            print("Введите элемент второго множества №$i: ")
            secondSet.add(readln())
        }

        val intersectionSet = firstSet intersect secondSet

        if (intersectionSet.isNotEmpty()) {
            println("Общие элементы множеств: ${intersectionSet.joinToString(", ")}")
        } else {
            println("Общих элементов нет")
        }
    } else {
        println("Введите корректные размеры множеств")
    }
}