fun main() {
    // 1. Запускает лямбду print() заданное количество раз
    fun repeatPrint(count: Int, print: () -> Unit) {
        for (i in 1..count) {
            print()
        }
    }

    // Пример использования repeatPrint
    repeatPrint(3) { println("Hello, World!") }

    // 2. Функция для вычисления среднего арифметического списка чисел
    fun average(numbers: List<Double>): Double {
        return if (numbers.isNotEmpty()) {
            numbers.sum() / numbers.size
        } else {
            0.0
        }
    }

    // Пример использования average
    val numbers = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
    println("Среднее арифметическое: ${average(numbers)}")

    // 3. Функция для фильтрации положительных чисел
    fun filterPositive(numbers: IntArray): IntArray {
        return numbers.filter { it > 0 }.toIntArray()
    }

    // Пример использования filterPositive
    val array = intArrayOf(-1, 2, -3, 4, 5)
    val positiveArray = filterPositive(array)
    println("Положительные числа: ${positiveArray.joinToString()}")

    // 4. Функция для обработки массива целых чисел
    fun processArray(numbers: IntArray): IntArray {
        return numbers.map { if (it % 2 == 0) it / 2 else it * 3 }.toIntArray()
    }

    // Пример использования processArray
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val processedArray = processArray(intArray)
    println("Обработанный массив: ${processedArray.joinToString()}")
}