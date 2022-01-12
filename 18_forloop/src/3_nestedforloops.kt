fun main(args: Array<String>) {

    /**
     * Like making
     * a table
     * */
    println("Like creating a table")
    for (i in 1..5) {
        for(j in 1..5) {
            print("$i,$j    ")
        }
        println()
    }

    /**
     * It is possible to work
     * with variable in range
     *
     * */

    println()
    println("Using variable ")
    var matrixSize = 7
    for(i in 1..matrixSize) {
        for(j in 1.. matrixSize) {
            if(i == j) {
                print("--- \t\t\t")
            } else {
                print("$i,$j \t\t\t")
            }
        }
        println()
    }


}