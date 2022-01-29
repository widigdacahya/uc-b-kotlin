fun main(args: Array<String>) {

    val child1 = Child()
    child1.raisePet()

    val child2 = OterChild()
    child2.raisePet()
}

/*
*  a class can implement multiple interface
* place it separated by comma
*
* interface have no constructor
*
* interfacecannot intilaizr values, but can update them
*
* interface can inherit form another interface
*
* */

interface Pet {
    fun play()
    fun needFeed()

    var cutenessLevel : Int
}

class Puppy: Pet {
    override fun play() {
        println("Play with puppy | jumping | barking")
    }

    override fun needFeed() {
        println("Puppy need small good bone guk guk")
    }

    override var cutenessLevel: Int = 8

}

class Child {
    var pet:Pet = Puppy()

    fun raisePet() {
        pet.play()
        pet.needFeed()
    }
}


class petStore() {
    fun getPuppy() : Pet {
        return Puppy()
    }
}

class OterChild {
    var pet: Pet
    init {
        val aPetStore = petStore()
        pet = aPetStore.getPuppy()
    }

    fun raisePet() {
        pet.play()
        pet.needFeed()
    }
}