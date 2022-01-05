fun main(args:Array<String>) {
    /**
     * we managed an amusement park,
     * we had a map stores dates and attendance
     *
     * */

    var attendance = hashMapOf(Pair("23 Sept", 2843), Pair("24 Sept", 4563), Pair("25 Sept", 4512))
    println("Initial map is $attendance")
    println()

    println("Add value 26 Sept")
    //attendance.put("26 Sept",4581) //other form
    attendance["26 Sept"] = 4581
    println("Aftter adding 26 Spet $attendance")
    println()

    var _25Sept = attendance["25 Sept"]?.toDouble()
    var _26Sept = attendance["26 Sept"]!!.toDouble()
    var tot25_26Sept = _25Sept?.plus(_26Sept)

    println("How many total in 25 and 26 Sept?$tot25_26Sept ")

    println()
    println("Other way , use elvis on cvariable declaratoin")
    var people23Sept = attendance["23 Sept"]?:0
    var people24Sept = attendance["24 Sept"]?:0
    println("This is more beautidul way to add 23 Sept adn 24 Sept ${people23Sept + people24Sept}")

    println()
    println("Is there data in 22 Spt? ${attendance.containsKey("22 Sept")}")

}