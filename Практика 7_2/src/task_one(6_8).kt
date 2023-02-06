import java.lang.Math.*
import kotlin.math.pow

fun main() {
    try {
        // 6(8) задание
        print("Введите a: ")
        val a = readLine()!!.toDouble()
        print("Введите b: ")
        val b = readLine()!!.toDouble()
        if (b == 0.0) throw Exception("'b' не может быть 0")

        print("Введите c: ")
        val c = readLine()!!.toDouble()
        print("Введите d: ")
        val d = readLine()!!.toDouble()
        if (c == b) throw Exception("'c' и 'd' не могут быть равны")

        print("Введите n: ")
        val n = readLine()!!.toDouble()
        println(String.format("%.2f", ((0.25 * (a - b)) / (1.0 / 8 - (abs(b)) / (10.0.pow(n + 3) + (log10(b)) / (c - d))))))
    }
    catch (e: Exception) {
        println(e)
    }
}