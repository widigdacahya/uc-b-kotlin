import java.lang.Exception

var board = arrayListOf<ArrayList<String>>()

fun main(args: Array<String>) {
    for (i in 0..2) {
        val row = arrayListOf<String>()
        for(j in 0..2) {
            row.add("")
        }
        board.add(row)
    }

    printBoard()


    /**
     * Player Move
     * */
    var continueGame = true

    do{
        print("Enter position(row,column), e.g 1,1 : ")
        var inputUser = readLine()?:""
        var x = 0
        var y = 0
        try {
            val positions = inputUser.split(",")
            x= positions[0].trim().toInt()
            y = positions[1].trim().toInt()

            /*
            * Flag to check win oe not
            * */
            var skipRound = false

            if(board[x-1][y-1] != "") {
                println("Position already taken, try other")
                skipRound = true
            } else {
                /**
                 * User play as x
                 * */
                board[x-1][y-1] = "X"
                printBoard()
            }

            if (!skipRound) {
                var playerWon = checkWinner(true)

                //to test when check tie, the computer not yet implment any draw(code not written yet)
                //var playerWon = false

                if(playerWon) {
                    println("\uD83C\uDF8A \uD83C\uDF8A \uD83C\uDF8A Congratualion, You Won \uD83C\uDF8A \uD83C\uDF8A \uD83C\uDF8A")
                    continueGame = false
                }
                val boardFullCondition = checkBoardFull()
                if(!playerWon && boardFullCondition) {
                    println("Tie . . .")
                    continueGame = false
                }
            }

        }catch (e: Exception) {
            println("Invalid Input, please try again")
        }

    }while (continueGame)


}

/**
 * If we pass TRUE to argument check whether player is won
 * If argument passed is False check the Computer won
 * */
fun checkWinner(player: Boolean): Boolean {

    var won = false
    val checkSymbol = if (player) "X" else "O"

    //check horizontal and vertical psoition
    for(i in 0..2) {

        //Horixontal Position
        if(board[i][0] == checkSymbol && board[i][1] == checkSymbol && board[i][2] == checkSymbol) {
            won = true
            break
        }

        //Vertical Position
        if(board[0][i] == checkSymbol && board[1][i] == checkSymbol && board[2][i] == checkSymbol) {
            won = true
            break
        }
    }

    //Diagonal COnditon
    if(board[0][0] == checkSymbol && board[1][1] == checkSymbol && board[2][2] == checkSymbol) {
        won = true
    }

    if (board[2][0] == checkSymbol && board[1][1] == checkSymbol && board[0][2] == checkSymbol) {
        won = true
    }

    return won
}

fun printBoard() {
    println("----------------")

    for (i in 0..2){
        for(j in 0..2) {
            when(board[i][j]) {
                "X" -> print("|  X  ")
                "O" -> print("|  O  ")
                else -> print("|    ")
            }
        }
        println("|")
        println("----------------")
    }
}

fun checkBoardFull() : Boolean {
    var boardFull = true
    for(i in 0..2) {
        for(j in 0..2) {
            if (board[i][j] == "") {
                boardFull = false
                break
            }
        }
    }
    return boardFull
}