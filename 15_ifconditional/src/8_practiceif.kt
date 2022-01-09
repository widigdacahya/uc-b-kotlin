fun main(args: Array<String>) {

    println("Please enter a number : ")
    val input = readLine()?:"0"
    var whatOutcome = if( (input.toInt())/10 == 0) {
        "Single number"
    } else {
        "Multiple digit"
    }

    println("Yow your input is $input and this is a $whatOutcome")

    //second question
    println()
    print("\nInput response code : ")
    val inputresp = readLine()?:"0"
    var somethin = if( (inputresp.toInt())/100 == 1) {
        "Information Response"
    } else if(inputresp.toInt()/100 == 2) {
        "Success"
    } else if(inputresp.toInt()/100 == 3) {
        "Redirect"
    } else if(inputresp.toInt()/100 == 4) {
        "Client Error"
    } else {
        "Server Error"
    }

    println("Your message is $inputresp, it meanse $somethin")

}