package getterandsetter

fun main(args: Array<String>) {

    val bankAccount = BankAccount()
    bankAccount.account = 500
    bankAccount.account = 499
    bankAccount.account = 500

}

class BankAccount {
    var creditRating = 500

    var account : Int = 0
        get() = field
        set(value) {
            if(value>account) {
                creditRating++
            } else {
                creditRating--
            }
            field = value
            println("the account $account or $field | New credit rating is $creditRating")
        }
}