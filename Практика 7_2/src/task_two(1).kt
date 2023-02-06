fun main() {
    try {
        // 1 задание
        print("Введите n: ")
        val n = readLine()!!.toInt()
        when {
            n % 3 == 0 -> println("Число $n кратно 3")
            else -> println("Число $n не кратно 3")
        }
    }
    catch (e: Exception) {
        println(e)
    }
}