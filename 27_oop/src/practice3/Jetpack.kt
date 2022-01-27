package practice3

fun main(args:Array<String>) {
    var peopleUseJetpack = Jetpack()

    peopleUseJetpack.burn(10)
    peopleUseJetpack.burn(10)

    peopleUseJetpack.stop(10)

}

class Jetpack {

    var userHeight = 0

    fun burn(timeInSecond: Int) {
        userHeight += timeInSecond
        println("\uD83D\uDE80 Burn for $timeInSecond seconds, go up for $userHeight")

    }

    fun stop(timeInSecond: Int) {
        userHeight -= (timeInSecond*3)

        if(userHeight<0) {
            userHeight = 0
        }

        println("\uD83C\uDF20\uD83C\uDF20 \uD83C\uDF20\uD83C\uDF20 Stop Jetpack Operation, now the height is $userHeight")
    }


}