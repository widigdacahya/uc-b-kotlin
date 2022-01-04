fun main(args: Array<String>) {
    println("Enter you bank amount : ")
    var userInputAccountBank = readLine()?:""
    var userBankAccoutAmount = userInputAccountBank.toDouble()
    var interesrtAcoutn = 0.055
    var firstYear = userBankAccoutAmount + (interesrtAcoutn*userBankAccoutAmount)
    var secondYear = firstYear + (interesrtAcoutn*firstYear)
    var thirdYear = secondYear + (interesrtAcoutn*secondYear)
    var forthYear = thirdYear + (interesrtAcoutn*thirdYear)
    var fifthYear = forthYear + (interesrtAcoutn*forthYear)
    println("Your amount in bak after 5 year with interest 5.5% is $fifthYear")
}