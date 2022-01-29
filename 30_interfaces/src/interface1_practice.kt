fun main(args: Array<String>) {

    val restaurantA = localRestaurant()
    restaurantA.provideMenu()
    restaurantA.giveBill()

    println()
    val otherRestauran = otherRestauran()
    otherRestauran.provideMenu()
    otherRestauran.specialPerform()
    otherRestauran.giveBill()

    println()
    val yowOther:Restaurant = otherRestauran()
    yowOther.provideMenu()
    yowOther.giveBill()

}


/*
* a people go to retaurent get some food and bill
*
* on another time, he want to try other food,
* so he came to othr restauran to get food and bill
*
* */

interface Restaurant {
    fun provideMenu()
    fun giveBill()
}

class localRestaurant: Restaurant {
    override fun provideMenu() {
        println("Here Local Restaurant Menu")
    }

    override fun giveBill() {
        println("Here your pay from local restaurant")
    }

}

class otherRestauran: Restaurant {
    override fun provideMenu() {
        println("Yow here our otherRestaurant Menu")
    }

    override fun giveBill() {
        println("Here your bill for dinner in our otherRestaurant")
    }

    fun specialPerform() {
        println("Come and see live performance")
    }

}