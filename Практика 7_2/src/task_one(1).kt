fun main() {
    try {
        // 1 задание
        print("Введите 1 член арифметической прогреции: ")
        val firstTerm = readLine()!!.toInt()
        print("Введите 5 член арифметической прогреции: ")
        val fifthTerm = readLine()!!.toInt()

        if (firstTerm == fifthTerm) throw Exception("Неверный ввод")

        val razn = (fifthTerm - firstTerm) / 4
        print("Введите n-ый член арифметической прогреции: ")
        val n = readLine()!!.toInt()

        if (n > 5 || n < 1) throw Exception("Неверный ввод")

        val nth = firstTerm + (n - 1) * razn
        val sum = (n / 2) * (2 * firstTerm + (n - 1) * razn)
        println("n-ый член прогресси: $nth")
        println("Сумма: $sum")
    }
    catch (e: Exception) {
        println(e)
    }
}