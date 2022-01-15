fun main(args: Array<String>) {
    nameAndGreet()
}

/**
 * create function that ask user for name
 * until empty string is introducted
 *
 * create local function that takes a name
 * and print a greeting
 *
 * For each name introduced, print out
 * a greeting
 *
 * */
fun nameAndGreet() {

    fun greet(name: String) {
        println("Hwello, $name")
    }

    while(true) {
        print("Input Name plz : ")
        var name = readLine()?:""
        if(name == "") {
            break
        } else {
            greet(name)
        }

    }
}