package typeparameter

fun main(args:Array<String>) {
    val iHaveAnAppleChef1 = Chef<Apple>()
    iHaveAnAppleChef1.cook(Apple())


    println()
    val chef2BananaL = Chef<Banana >()
    chef2BananaL.cook(Banana())

    //pass generic type eg use String
    //are not allowed

    println()
    val mysteryDishBox = BoxDish<Banana,Spinach>()
    mysteryDishBox.dispDish(Banana(), Spinach())
}

/*
*
* Retrcit type of generic parameter
* */

abstract class Fruit{
    abstract fun peel()
}

abstract class Veggies{
    abstract fun cleanVeg()
}

class Spinach:Veggies() {
    override fun cleanVeg() {
        println("Ssssh Cleaning Spinach")
    }

}

class Carrot:Veggies() {
    override fun cleanVeg() {
        println("SSSh Orange Carrot")
    }

}

class Apple:Fruit() {
    override fun peel() {
        println("Peeling the apple")
    }

}

class Banana:Fruit() {
    override fun peel() {
        println("Peel peel Banana")
    }

}

class Chef<T:Fruit> {
    fun cook(item:T) {
        item.peel()
    }
}


/*
* Multipele constraint separate by commas
* */

class BoxDish<T:Fruit, U:Veggies>{
    fun dispDish(itemFruit: T, itemVeg: U) {
        println("Our main dish is $itemFruit and $itemVeg")
    }
}