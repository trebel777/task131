fun main() {
    println(agoToText(30001))

}

fun agoToText(seconds: Int) = when {
    seconds <= 60 -> "Был(а) в сети только что"
    seconds > 60 && seconds < 60 * 60 -> "Был(а) в сети ${seconds / 60} ${minutesText(seconds / 60)} назад "
    seconds > 60 * 60 + 1 && seconds < 24 * 60 * 60 -> "Был(а) в сети ${seconds / 60 / 60} ${hoursText(seconds)} назад"
    seconds > 24 * 60 * 60 + 1 && seconds < 24 * 60 * 60 * 2 -> "Был(а) в сети сегодня"
    seconds > 24 * 60 * 60 * 2 + 1 && seconds < 24 * 60 * 60 * 3 -> "Был(а) в сети вчера"
    else -> "Был(а) в сети давно"
}

fun minutesText(seconds: Int) = when {
    seconds == 11 || seconds == 12 || seconds == 13 || seconds == 14 -> "минут"
    seconds % 10 == 2 || seconds % 10 == 3 || seconds % 10 == 4 -> "минуты"
    seconds % 10 == 1 -> "минуту"
    else -> "минут"
}

fun hoursText(seconds: Int) = when (seconds / 3600) {
    1, 21 -> "час"
    2, 3, 4, 22, 23, 24 -> "часа"
    else -> "часов"
}
