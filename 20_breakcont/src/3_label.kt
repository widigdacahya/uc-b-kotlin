fun main(args: Array<String>) {

    /**
     * label used to mark a position in
     * code that we can jump to
     *
     * can be used with break and continue
     * */

    outerloop@for(i in 1..5) {
        for(j in 1..5) {
            if(i%3 == 0) {
                continue@outerloop
            }
            println("$i | $j")
        }
    }

}