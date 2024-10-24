package kt_base

fun main(){
//    Вводится длина списка. Затем - n элементов списка, каждый
//    на новой строке. Напишите программу, которая выводит множество из
//    уникальных элементов в оригинальном порядке

    print("Введите длину списка: ")
    val listSize = readln().toIntOrNull()

    if (listSize != null && listSize > 0) {
        val list = mutableListOf<String>()

        for (i in 1..listSize) {
            print("Введите элемент списка №$i: ")
            val element = readln()
            if (element !in list) {
                list.add(element)
            }
        }

        println("Уникальные элементы списка: ${list.joinToString(", ")}")
    } else {
        println("Введите корректную длину списка")
    }
}