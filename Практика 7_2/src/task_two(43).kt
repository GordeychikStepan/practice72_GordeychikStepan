import java.lang.Math.abs

fun main() {
    try {
        // 43 задание
        print("Введите k1: ")
        val k1 = readLine()!!.toDouble()
        print("Введите b1: ")
        val b1 = readLine()!!.toDouble()
        print("Введите k2: ")
        val k2 = readLine()!!.toDouble()
        print("Введите b2: ")
        val b2 = readLine()!!.toDouble()
        print("Введите e: ")
        val e = readLine()!!.toDouble()
        if (e > 0){
            val x = (b2 - b1) / (k1 - k2)
            val y = k1 * x + b1

            when {
                k1 == k2 -> {
                    if (abs(b1 - b2) < e) {
                        println("Линии пересекаются в начале координат")
                    } else {
                        println("Линии не пересекаются")
                    }
                }
                abs(x) < e && abs(y) < e -> println("Точка пересечения в окрестности: ($x, $y)")
                else -> println("Точка пересечения не находится вблизи окрестности")
            }
        }
        else println("Ошибка ввода.")

    }
    catch (e: Exception) {
        println(e)
    }
}