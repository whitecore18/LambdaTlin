fun filterPositiveNumbers(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}

fun processArray(numbers: List<Int>, process: (Int) -> Int): List<Int> {
    // Создаем новый список для хранения обработанных элементов
    val result = mutableListOf<Int>()

    // Проходим по каждому элементу массива и применяем лямбду
    for (number in numbers) {
        result.add(process(number))
    }

    return result
}

fun main() {
    // 1. Повторное выполнение действия

    fun repeatPrint(count: Int, print: () -> Unit) {
        for (i in 1..count) {
            print()
        }
    }
    repeatPrint(3) { println("Hello, World!") }

    //Задача 2:

    val numbers = listOf(1, 2, 3, 4, 5)

    val sum = numbers.reduce { acc, number -> acc + number }

    val count = numbers.fold(0) { acc, _ -> acc + 1 }

    val average = sum.toDouble() / count

    println("Среднее арифметическое: $average")

    //Задача 3:

    val digits = listOf(-10, 15, 0, 23, -5, 42, -1, 8)

    val positiveFilter: (Int) -> Boolean = { it > 0 }

    val positiveNumbers = filterPositiveNumbers(digits, positiveFilter)

    println("Положительные числа: $positiveNumbers")

    //Задача 4:

    val numbersThree = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val processLambda: (Int) -> Int = {
        if (it % 2 == 0) {
            it / 2
        } else {
            it * 3
        }
    }

    val processedNumbers = processArray(numbersThree, processLambda)

    println("Обработанные числа: $processedNumbers")
}
