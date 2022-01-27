package getterandsetter

fun main(args: Array<String>) {
    val anAccountOfCahya = BankAccounts()
    anAccountOfCahya.amount = 999
    anAccountOfCahya.amount = 7800
    anAccountOfCahya.amount = 999999
}

class BankAccounts {
    var interesetRate = 0.0

    var amount : Int = 0
        get() = field
        set(value) {
            if(value<1000) {
                interesetRate = 1.0
            } else if (value < 10000) {
                interesetRate = 0.5
            } else {
                interesetRate = 0.2
            }
            field = value
            println("The Client has $value on theri account so the interes rate is $interesetRate")

        }

}