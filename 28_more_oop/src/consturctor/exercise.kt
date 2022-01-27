package consturctor

fun main(args:Array<String>) {
    val user1 = UserAccount()
    val user2 = UserAccount("Budi")
    val user3 = UserAccount("Cahyadesthian",999999999)
}

class UserAccount {
    var userName = "name"
    var balance = 0
    val tshirtPrice = 20

    fun canAfford() {
        if (balance>tshirtPrice) {
            println("$userName can afford ${balance/tshirtPrice} t-shirt with balance $balance")
        } else {
            println("$userName sorry noTshirt could get with balance $balance")
        }
    }

    constructor() {
        userName = "Generic User"
        balance = 1
        canAfford()
    }

    constructor(theName: String) {
        userName = theName
        balance = 5
        canAfford()
    }

    constructor(theNAme: String, balanceUser:Int) {
        userName = theNAme
        balance =balanceUser
        canAfford()
    }


}