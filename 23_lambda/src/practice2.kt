fun main(args: Array<String>) {

    /**
     * Given set of random integer, print out subset that consist only
     * of doublle digit integer
     *
     * */
    val randomSetInt = setOf(3,12,14,233,124,14153,24,3215,135,12,234,35,76,43,93,45)
    println("From $randomSetInt would be print 2 digit")
    println(randomSetInt.filter { it in 10..100 })


    /**
     * Given a list of client from online store
     * Display list that sort the name from lass letter
     * */
    println()
    println("Sort by last Char")
    val clientName = listOf("Padmasari", "Prameswari", "Agniasari", "Candreaningtyas", "Dyah", "Estiningtyas", "Feby", "Gita", "Hartanti", "Indraswari", "Jayasri", "Kinasih", "Kirana Kusuma","Listiani Lestari", "Maharani Maryanti", "Nindita", "Ratimaya Puspita", "Sasmita", "Tari", "Utari Utami", "Wulandari Wardaya", "Yekti Yulianti", "Zalfa")
    println(clientName.sortedBy { it[it.length-1] })

    /**
     * Given a list 3 digit integers
     * Print out the integer has the biggest middle digit
     * */
    println()
    println("Give 3 digit integer, need to print max middle digit")
    val ints = listOf(124,860,690,342,999,314,145,953,495,950,519,939,852,331,222,534)
    //println("max middle digit ${ints.maxByOrNull { it.toString()[1].toInt() }}")
    //other form
    println("max mid digit is ${ints.maxByOrNull { it/10%10 }}")

}

