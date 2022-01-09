fun main(args: Array<String>) {

    print("Please enter an Animal : ")
    var inputUser = readLine()?:"cat"
    var theAnimalAction = if(inputUser == "cat") {
        "petIt"
    } else if (inputUser == "dog") {
        "feed it"
    } else if(inputUser == "Crocodile") {
        "run"
    } else {
        "google it"
    }

    println("So the animal front of you is $inputUser , so you need to $theAnimalAction")


}