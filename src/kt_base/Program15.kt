package kt_base

fun main(){
//    Вводится длина массива. Затем вводится длина для нового
//    массива. Напишите программу, которая создаёт массив из этих чисел и
//    выводит их новый массив, содержащий все те же числа, но в обратном
//    порядке

    print("Введите длину массива: ")
    val arraySize = readln().toIntOrNull()

    if (arraySize != null && arraySize > 0) {
        val array = IntArray(arraySize)

        for (i in array.indices) {
            print("Введите элемент массива №${i + 1}: ")
            array[i] = readln().toInt()
        }

        val reversedArray = array.reversedArray()

        println("Новый массив в обратном порядке: ${reversedArray.joinToString(", ")}")
    } else {
        println("Введите корректную длину массива")
    }
}