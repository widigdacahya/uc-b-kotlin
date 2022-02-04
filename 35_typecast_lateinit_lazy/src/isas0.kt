/*
* [is]
* Is check wether variable is certain type
* the opposite is !is
*
* [as]
* convert an object into diffrtn type
*
*
* Null safe operator as?
*
* */

fun main(args:Array<String>) {

    checkUsingIs()

    val myLappy : LaptopBagus = giftedLaptop()
    if(myLappy !is LenovoIdeapad) {
        println("These is x brand")
    } else {
        println("uwu these are lenovo ideapad")
    }



    val lappy2 : LaptopBagus = gtedLaptopLenovo()
    if(lappy2 !is LenovoIdeapad) {
        println("These is x brand")
    } else {
        println("uwu these are lenovo ideapad")
    }

    println()
    val lappyJunio : LaptopBagus = gtedLaptopLenovo()
    if(lappyJunio is LenovoIdeapad) {
        (lappyJunio as LenovoIdeapad).operate()
    }


    println()
    var aLenovoLeppy = lappyJunio as? LenovoIdeapad
    aLenovoLeppy?.operate()

}

fun checkUsingIs() {
    var aString = "This is a string"
    if(aString is String) {
        println("Yuuuhuw its a string")
    }
}


open class LaptopBagus{ }
class LenovoIdeapad: LaptopBagus() {

    fun operate() {
        println("Openning an awesome Lenovo")
    }

}

fun giftedLaptop():LaptopBagus = LaptopBagus()
fun gtedLaptopLenovo(): LaptopBagus = LenovoIdeapad()
