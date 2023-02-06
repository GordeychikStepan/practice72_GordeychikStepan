fun main() {
    try {
        // 31 задание
        print("Введите x1 (точка M1): ")
        val x1 = readLine()!!.toDouble()
        print("Введите y1 (точка M1): ")
        val y1 = readLine()!!.toDouble()
        print("Введите x2 (точка М2): ")
        val x2 = readLine()!!.toDouble()
        print("Введите y2 (точка М2): ")
        val y2 = readLine()!!.toDouble()
        print("Введите x3 (точка N1): ")
        val x3 = readLine()!!.toDouble()
        print("Введите y3 (точка N1): ")
        val y3 = readLine()!!.toDouble()
        print("Введите x4 (точка N2): ")
        val x4 = readLine()!!.toDouble()
        print("Введите y4 (точка N2): ")
        val y4 = readLine()!!.toDouble()
        val k1 = (y2 - y1) / (x2 - x1)
        val k2 = (y4 - y3) / (x4 - x3)
        when {
            k1 == k2 -> println("Линии параллельны.")
            else -> {
                val b1 = y1 - k1 * x1
                val b2 = y3 - k2 * x3
                if (b1 == b2) {
                    println("Линии совпадают.")
                }
                else {
                    val x = (b2 - b1) / (k1 - k2)
                    val y = k1 * x + b1
                    println("Линии пересекаются в координатах:")
                    println("x = $x, y = $y")
                }
            }
        }
    }
    catch (e: Exception) {
        println(e)
    }
}