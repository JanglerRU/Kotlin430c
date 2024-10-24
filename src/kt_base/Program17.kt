package kt_base

fun main(){
//    На вход программе подаётся число  элементов первого множества.
//    Затем число второго множества. Напишите программу, которая создаёт
//    два множества из данных элементов и возвращает их объединение

    print("Введите количество элементов первого множества: ")
    val firstSetSize = readln().toIntOrNull()

    print("Введите количество элементов второго множества: ")
    val secondSetSize = readln().toIntOrNull()

    if (firstSetSize != null && firstSetSize > 0 && secondSetSize != null && secondSetSize > 0) {
        val firstSet = mutableSetOf<String>()
        for (i in 1..firstSetSize) {
            print("Введите элемент первого множества №$i: ")
            firstSet.add(readln())
        }

        val secondSet = mutableSetOf<String>()
        for (i in 1..secondSetSize) {
            print("Введите элемент второго множества №$i: ")
            secondSet.add(readln())
        }

        val unionSet = firstSet union secondSet

        println("Объединение множеств: ${unionSet.joinToString(", ")}")
    } else {
        println("Введите корректные размеры множеств")
    }
}