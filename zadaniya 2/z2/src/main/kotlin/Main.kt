import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Сколько лайков?")
    val likes = scanner.nextInt()
    if (likes % 2 == 1)
        println("Понравилось " + likes + " человеку")
    if (likes % 2 == 0)
        println("Понравилось " + likes + " людям")
}