import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Введите сумму перевода")
    val amount = scanner.nextInt()
    if (amount > 35)
        println("Комиссия за перевод составляет " + amount * 0.0075 + "\nСумма перевода с учетом комиссии составляет " + (amount - amount * 0.0075))
    else
        println("Перевод без комиссии")
}