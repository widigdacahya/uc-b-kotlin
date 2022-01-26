import kotlin.random.Random

/***
 * Hangman Game
 *
 * Guese a word, letter by letter
 * Give 6 chances
 * Every mistake make a man drawn
 * if the man is drawn, he would be hang, and game over
 * if the word is guessed right, the man is spared
 *
 */


val words = listOf("cat", "dog", "caterpillar", "hippopotamus", "crocodile", "hamster", "lizard", "fish", "bat", "rabbit", "wolf", "cow", "sheep", "bear")
var word = ""
val wordGuess = arrayListOf<Char>()
var guessChance = 6
var mistakes = 0

fun main(args: Array<String>) {
    setupGame()
}


/*
* take word from our list to be guessed
*
* */
fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase()
    //println("The word is $word and the index is $wordIndex") //count from zero

    //println(word) //-----------[UNCOMMENT TO KNOW THE WORD FIRST ]---------------

    //println("----")
    //println(word.indices)
    //for(i in word.indices) {
    //    print("${word[i]} ")
    //}

//    print0Mistakes()
//    print1Mistake()
//    print2Mistakes()
//    print3Mistakes()
//    print4Mistakes()
//    print5Mistakes()
//    print6Mistakes()

    for(i in word.indices) {
        wordGuess.add('_')
    }





    var gameOver = false

    do {
        printGameStatus()
        println("Guess the letter : ")
        var inputString = readLine()?:""

        if(inputString.isEmpty()) {
            println("Thaths not valid input.Try Again, plz :) ")
        } else {
            var letter = inputString[0].toUpperCase()
            //var letterUsed = letter.toChar().upp

            if(word.contains(letter)) {
                for(i in word.indices) {
                    if(word[i] == letter) {
                        wordGuess[i] = letter
                    }
                }

                //if letter guessed
                if(!wordGuess.contains('_')) {
                    gameOver = true
                }
            } else {
                println("Sorry, wrong guess")
                guessChance--
                mistakes++
                if(mistakes == 6) {
                    gameOver = true
                }
            }
        }

    } while (!gameOver)

    if(mistakes == 6) {
        printGameStatus()
        println("Not our day man, The word is $word")
    } else {
        println("Congratulations, you win... Yay. You can guess $word")
    }

}

/**
 * base on number mistake and
 * draw the hangman
 * */
fun printGameStatus() {
    when(mistakes) {
        0 -> print0Mistakes()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }

    print("WORD : ")
    for(element in wordGuess) {
        print("$element ")
    }

    println("\nRemaining Guess(es) left : $guessChance")
}


/***
 * Game art (draw character art)
 */
fun print0Mistakes() {
    println("   |--------|---")
    println("   |        |   ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("  /|\\          ")
    println(" / | \\         ")
    println("/  |  \\        ")
}

fun print1Mistake() {
    println("   |--------|---")
    println("   |        |   ")
    println("   |        0   ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("  /|\\          ")
    println(" / | \\         ")
    println("/  |  \\        ")
}

fun print2Mistakes() {
    println("   |--------|---")
    println("   |        |   ")
    println("   |        0   ")
    println("   |        |   ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("  /|\\          ")
    println(" / | \\         ")
    println("/  |  \\        ")
}

fun print3Mistakes() {
    println("   |--------|---")
    println("   |        |   ")
    println("   |        0   ")
    println("   |        |\\ ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("  /|\\          ")
    println(" / | \\         ")
    println("/  |  \\        ")
}

fun print4Mistakes() {
    println("   |--------|---")
    println("   |        |   ")
    println("   |        0   ")
    println("   |       /|\\ ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("  /|\\          ")
    println(" / | \\         ")
    println("/  |  \\        ")
}

fun print5Mistakes() {
    println("   |--------|---")
    println("   |        |   ")
    println("   |        0   ")
    println("   |       /|\\ ")
    println("   |        |   ")
    println("   |       /    ")
    println("   |            ")
    println("  /|\\          ")
    println(" / | \\         ")
    println("/  |  \\        ")
}

fun print6Mistakes() {
    println("   |--------|---")
    println("   |        |   ")
    println("   |        0   ")
    println("   |       /|\\ ")
    println("   |        |   ")
    println("   |       / \\ ")
    println("   |            ")
    println("  /|\\          ")
    println(" / | \\         ")
    println("/  |  \\        ")
}
