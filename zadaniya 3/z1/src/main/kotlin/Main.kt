import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

fun agoToText(lastVisit: LocalDateTime) {
    val now = LocalDateTime.now()
    val second = ChronoUnit.SECONDS.between(lastVisit,now)
    var minutes = ChronoUnit.MINUTES.between(lastVisit, now)
    var hours = ChronoUnit.HOURS.between(lastVisit, now)
    val day = ChronoUnit.DAYS.between(lastVisit, now)
    if (day >= 3)
    {
        println("был(а) давно")
    } else if ((day >= 2) && (day < 3))
    {
        println("был(а) позавчера")
    } else if ((day >= 1) && (day < 2))
    {
        println("был(а) вчера")
    } else if ((1 <= hours) && (day < 1))
    {
        print("был(а) " + hours)
        if (hours > 10)
        {
            hours - 10
            return
        }
        if (hours.toInt() == 1)
        {
            println(" час назад")
        } else if (hours.toInt() == 2 || hours.toInt() == 3 || hours.toInt() == 4)
        {
            println(" часа назад")
        } else
            println(" часов назад")
    } else if ((1 <= minutes) && (hours < 1))
    {
        print("был(а) " + minutes)
        if (minutes > 10)
        {
            minutes - 10
            return
        }
        if (minutes.toInt() == 1)
        {
            println(" минуту назад")
        } else if (minutes.toInt() == 2 || minutes.toInt() == 3 || minutes.toInt() == 4)
        {
            println(" минуты назад")
        } else
            println(" минут назад")
    } else if ((0 <= second) && (second < 60))
    {
        println("был(а) только что")
    }
}
fun main(args: Array<String>) {
    val lastVisit = LocalDateTime.of(2024, 2, 2, 11, 36, 0)
    println(agoToText(lastVisit))
}
