fun main() {
    try {
        // 4 задание
        val farengait = 451.0
        val c = (farengait - 32) * 5/9
        println("Название повести по Цельсию: ${String.format("%.2f", c)} градус по Цельсию")
    }
    catch (e: Exception) {
        println(e)
    }
}