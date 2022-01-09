fun main(args: Array<String>) {
    print("Input a grade : ")
    val inputGrade = readLine()?:""

    var theGrade = inputGrade.toInt()

    if (theGrade>100) {
        println("What a value")
    } else {
        var theValue = if(inputGrade.toInt() in 90..100) {
            "A"
        } else if(theGrade in 80..89) {
            "B"
        } else if(theGrade in 70 .. 79) {
            "C"
        } else if(theGrade in 60 .. 69) {
            "D"
        } else if(theGrade in 50 .. 59) {
            "E"
        } else {
            "ecverthuing else"
        }

        println("The grade is $theGrade and it meadns you gat  $theValue")

    }



}