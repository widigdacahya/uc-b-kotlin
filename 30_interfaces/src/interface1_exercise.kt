fun main(args: Array<String>) {

    val aCoffeShop = CoffeeShop()

    var iBoughtAcofee : Coffee? = null

    //buy fie cofee
    for(i in 1..5) {
        iBoughtAcofee = aCoffeShop.giveCoffee()
        iBoughtAcofee.wakeYouUp()
        iBoughtAcofee.quechYourThirst()
        println()
    }

}

/*
* Youre in coffeshop
* exhauseted, need some enrgy
*
* any coffee you get, can make you up
* so they provide you happily
*
* */

//interface CoffeeShop {
//    fun makeArabica()
//    fun makeRobista()
//}
//
//class

interface Coffee {
    fun wakeYouUp()
    fun quechYourThirst()
}

class Arabica: Coffee {
    override fun wakeYouUp() {
        println("Arabica wake you Up")
    }

    override fun quechYourThirst() {
        println("Arabica make you feel better")
    }

}

class Robusta:Coffee {
    override fun wakeYouUp() {
        println("Robusta make you eyes brigther")
    }

    override fun quechYourThirst() {
        println("Robusta quench yout thist for coffee")
    }

}

class CoffeeShop {
    fun giveCoffee() : Coffee {
        var randomNumber = System.currentTimeMillis()

        return if(randomNumber%2 == 0L) {
            Arabica()
        } else {
            Robusta()
        }
    }
}