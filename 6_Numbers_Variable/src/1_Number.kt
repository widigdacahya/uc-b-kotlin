fun main(args: Array<String>) {
    var price = 1000
    var qty = 23
    var total = price * qty
    println("You have buy $qty of molen that each one has a price of $price so the total is $total")

    // Numbers type has different size in memory and have max and min
    /*
    * Type      Size(Bits)      Min Value                               Max Value
    * ------------------------------------------------------------------------------------------------------
    * Byte      8               -128                                    127
    * Short     16              -32768                                  32767
    * Int       32              -2147483648 or (-2^31)                  2147483647 or ( (2^31)-1 )
    * Long      64              -9.223.372.036.854.775.807 or (-2^64)   9.223.372.036.854.775.807 or ( (2^64)-1 )
    * */

    //Float
    /*
    * Type      Size(bits)      Decimal Digits
    * -------------------------------------------
    * Float     32              6-7
    * Double    64              15-16
    * */

    var items = 5
    var nbOfPeople = 79000000000
    var priceOfSomething = 29.99
    var pi = 3.1415926535

    println(items::class.java)
    println(nbOfPeople::class.java)
    println(priceOfSomething::class.java)
    println(pi::class.java)

}