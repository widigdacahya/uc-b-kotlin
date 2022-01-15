fun main(args: Array<String>) {
    var parakeets = 5
    moreParkeets(parakeets)
    println("Now, your parakeets are $parakeets")
}

fun moreParkeets(parakeets: Int) {
    println("----parkets before val = $parakeets")
    val parakeets = 3
    println("----parkets after val = $parakeets")
}