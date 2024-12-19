fun main() {
    // 1. Повторное выполнение действия
    fun repeatPrint(count: Int, print: () -> Unit) {
        for (i in 1..count) {
            print()
        }
    }

    repeatPrint(3) { println("Hello, World!") }

    // 2. Среднее арифметическое
    val average: (List<Double>) -> Double = { numbers ->
        if (numbers.isNotEmpty()) {
            numbers.sum() / numbers.size
        } else {
            0.0
        }
    }

    val numbers = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
    println("Среднее арифметическое: ${average(numbers)}")

    // 3. Фильтрации положительных чисел
    val filterPositive: (IntArray) -> IntArray = { numbers ->
        numbers.filter { it > 0 }.toIntArray()
    }

    val array = intArrayOf(-1, 2, -3, 4, 5)
    val positiveArray = filterPositive(array)
    println("Положительные числа: ${positiveArray.joinToString()}")

    // 4. Обработка массива целых чисел
    val processArray: (IntArray) -> IntArray = { numbers ->
        numbers.map { if (it % 2 == 0) it / 2 else it * 3 }.toIntArray()
    }

    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val processedArray = processArray(intArray)
    println("Обработанный массив: ${processedArray.joinToString()}")
}
