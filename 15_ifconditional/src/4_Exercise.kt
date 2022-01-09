fun main(args: Array<String>) {
    print("What time in your place now (0-23) ? :  ")
    var userInputHour = readLine()?:"0"
    var hourDet = userInputHour.toInt()

    if(hourDet < 12) {
        println("Yow, it's $hourDet A.M.")
    } else {
        if(hourDet == 12) {
            println("Now is 12 P.M.")
        } else {
            println("Hiuu, it is ${hourDet - 12 } P.M.")
        }
    }

}