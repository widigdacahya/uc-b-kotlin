fun main(args: Array<String>) {
    print("Please enetr your name : ")
    val inpuUser = readLine()?:""
    when(inpuUser[0]) {
        'A','B','C' -> println("Hellow $inpuUser, nice day!")
        in 'D'..'F' -> println("Yow hi $inpuUser, have a good day! ")
        else -> println("Holla $inpuUser, awesemoe day!")
    }
}