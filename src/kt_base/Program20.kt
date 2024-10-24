package kt_base

fun main(){
//    Напишите программу, которая принимает элементы списка через
//    запятую и возвращает Map, где ключи - уникальные элементы списка, а
//    значения - количество раз, которое каждый элемент встречается в
//    списке.

    print("Введите элементы списка через запятую: ")
    val input = readln()

    val elements = input.split(",").map { it.trim() }

    val frequencyMap = mutableMapOf<String, Int>()

    for (element in elements) {
        frequencyMap[element] = frequencyMap.getOrDefault(element, 0) + 1
    }

    println("Частота элементов:")
    for ((key, value) in frequencyMap) {
        println("$key: $value")
    }
}