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

            if(board[x-1][y-1] != "") {
                println("Position already taken, try other")
            } else {
                /**
                 * User play as x
                 * */
                board[x-1][y-1] = "X"
                printBoard()
            }

        }catch (e: Exception) {
            println("Invalid Input, please try again")
        }

    }while (continueGame)


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