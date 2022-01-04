fun main(args: Array<String>) {
    val isDay = true
    var isEvening = true

    println("using && on isDay = $isDay and isEvening = $isEvening would give us ${isDay && isEvening}")
    isEvening = false
    println("using && on isDay = $isDay and isEvening = $isEvening would give us ${isDay && isEvening}")
    println("using || on isDay = $isDay and isEvening = $isEvening would give us ${isDay || isEvening}")

    val isNight = !isDay
    println("If we habe isDay = $isDay and isNight = !isDay so isNight is $isNight")

}