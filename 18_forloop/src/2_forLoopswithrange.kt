fun main(args: Array<String>) {

    /**
     *
     * Range ascending
     *
     * */

    for(i in 1..3) {
        println("Strike #$i")
    }
    println("Plz, Exit door is over there")


    /**
     * Range descending
     * 10 downTo
     * */
    for(i in 10 downTo 0) {
        println("This is i = $i")
        when(i) {
            9 -> println("Start your engine")
            6 -> println("on your marks")
            3 -> println("Get set")
            0 -> println("GO!")
        }
    }


    /**
     * Range skip step
     *
     * 10 downTo 0 step 3
     *
     * */

    println()
    for(i in 10 downTo 0 step 3) {
        println(i)
    }

}