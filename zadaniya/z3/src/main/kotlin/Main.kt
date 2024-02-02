import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Какая сумма покупки?")
    val sum = scanner.nextInt()
    if ((0 < sum) && (sum < 1000))
        println("Скидка не предоставляется")
    if ((1001 < sum) && (sum < 10_000))
        println("Скидка составляет 100 рублей")
    if (10_001 < sum)
        println("Скидка составляет 5% от суммы")
}