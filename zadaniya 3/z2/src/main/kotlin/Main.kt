import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Введите тип карты: Mastercard, Maestro, Visa, Мир, VK Pay")
    val card: String = scanner.nextLine()
    println("Введите сумму перевода")
    val amount = scanner.nextInt()
    if ((card == "Mastercard") || (card == "Maestro")) {
        if ((300 < amount) && (amount < 75000)) {
            



        }
    } else if ((card == "Visa") || (card == "Мир"))
    {
        if (amount > 35)
            println("Комиссия за перевод составляет " + amount * 0.0075 + "\nСумма перевода с учетом комиссии составляет " + (amount - amount * 0.0075))
    } else
        println("Перевод без комиссии")
}