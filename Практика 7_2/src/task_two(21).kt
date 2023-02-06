import kotlin.math.*

fun main() {
    try {
        // 21 задание
        println("Вариант 1.")
        print("Введите x: ")
        val x1 = readLine()!!.toDouble()
        val F: Double = when{
            x1 < 0 -> 4.0
            x1 in 0.0..1.0 -> x1 * x1 + 3 * x1 + 4
            else -> x1 + 7
        }
        println("F(x) = ${String.format("%.1f", F)}")

        println("Вариант 2.")
        print("Введите x: ")
        val x2 = readLine()!!.toDouble()
        print("Введите a: ")
        val a = readLine()!!.toDouble()
        print("Введите b: ")
        val b = readLine()!!.toDouble()
        val pi = kotlin.math.PI
        when{
            x2 < 0 -> println("F(x) = ${String.format("%.4f", sin(x2 + pi / 2).pow(2))}")
            x2 in a..b -> println("F(x) = ${String.format("%.4f", exp(x2) * sin(x2 + pi / 2))}")
            x2 > b -> println("F(x) = ${String.format("%.4f", sqrt(abs(sin(x2 + pi / 3)) + 2.1 * 10.0.pow(-3)))}")
            else -> println("Неверный ввод значений")
        }
    }
    catch (e: Exception) {
        println(e)
    }
}