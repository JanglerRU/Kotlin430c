package kt_base

fun main(){
//    вводится число, после него вводится число элементов
//    массива. Программа создаёт массив из этих чисел и проверяет,
//    содержится ли в нем заданное число. Если число есть - выведите в
//    консоль true, иначе - false

    print("Введите число для поиска: ")
    val searchNumber = readln().toIntOrNull()

    print("Введите количество элементов массива: ")
    val arraySize = readln().toIntOrNull()

    if (searchNumber != null && arraySize != null && arraySize > 0) {

        val array = IntArray(arraySize)

        for (i in array.indices) {
            print("Введите элемент массива №${i + 1}: ")
            array[i] = readln().toInt()
        }

        val result = searchNumber in array
        println(result)
    } else {
        println("Введите корректные значения для числа и размера массива")
    }
}