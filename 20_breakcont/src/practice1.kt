fun main(args: Array<String>) {

    /**
     * animal shelter accepting all animal except snake
     * a user allowed to bring 5 animal to shelter
     *
     * ask su== user to input animal they want
     * if they bring snake, print a messahge and stop accepting animal
     * */

    println()
    println("Welcome tho the shelter. We accept 5 animal")
    print("What do you bring : ")
    var shelterTemp = arrayListOf<String>()
    var counter =0
    var alreadyFive = false
    do{
        var inp = readLine()?:""
        if(inp == "snake") {
            println("Sorry snakes are forbidden")
            break
        } else {
            shelterTemp.add(inp)
            counter++
            println("Ok, $inp proceeed")
            print("What do you bring : ")
            if(counter == 5) {
                alreadyFive = true
                println("Thanks for five animals")
            }
        }
    } while(!alreadyFive)


    /**
     * You have a list of clients
     *
     * rprint out the greeting message unless the namse star with 'C'
     *
     * */

    var clients = listOf("Basagita", "Padmasari", "Candramaya", "Cahyaningrum", "Prameswari")
    for(name in clients) {
        if(name[0] == 'C') {
            continue
        } else {
            println("Hwello, have a great day! Nice to see you $name ")
        }
    }


}