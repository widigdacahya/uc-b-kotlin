package ocp

fun main(args: Array<String>) {
    val standardCinema = StandardCinema(100.0)
    val adminFeeStandarCinema = standardCinema.calculateAdminFee()
    println(adminFeeStandarCinema)
}