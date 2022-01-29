fun main(args: Array<String>) {
    var myFood : Food = RestaurantFastFood().boughtFood()
    myFood.feed()

    myFood = RestaurantFrench().giivveFoodThatTodaySpecial()
    myFood.feed()
}

interface Food {
    fun feed()
}

class FastFood: Food {
    override fun feed() {
        println("Eating Fast Food make you fill")
    }

}

class FrenhFood: Food {
    override fun feed() {
        println("Frenchfood eaten. So delightfull")
    }

}

class RestaurantFastFood {
    fun boughtFood(): Food {
        return FastFood()
    }
}

class RestaurantFrench {
    fun giivveFoodThatTodaySpecial() : Food {
        return FrenhFood()
    }
}