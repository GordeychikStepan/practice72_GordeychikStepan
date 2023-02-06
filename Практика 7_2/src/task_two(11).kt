fun main() {
    try {
        // 11 задание
        println("Вариант a.")
        print("Введите координату x: ")
        val xA = readLine()!!.toDouble()
        print("Введите координату y: ")
        val yA = readLine()!!.toDouble()
        when{
            (xA * xA) + (yA * yA) <= 1 -> println("Координаты принадлежат кругу (а)")
            else -> println("Координаты не принадлежат кругу (а)")
        }

        println("Вариант б.")
        print("Введите координату x: ")
        val xB = readLine()!!.toDouble()
        print("Введите координату y: ")
        val yB = readLine()!!.toDouble()
        when{
            ((xB * xB) + (yB * yB) <= 1) && ((xB * xB) + (yB * yB) >= 0.5) -> println("Координаты принадлежат окружности (а)")
            else -> println("Координаты не принадлежат окружности (б)")
        }

        println("Вариант в.")
        print("Введите координату x: ")
        val xV = readLine()!!.toDouble()
        print("Введите координату y: ")
        val yV = readLine()!!.toDouble()
        when{
            xV > 1 || xV < -1 || yV > 1 || yV < -1 -> println("Координаты не принадлежат квадрату (в)")
            else -> println("Координаты принадлежат квадрату (в)")
        }
    }
    catch (e: Exception) {
        println(e)
    }
}