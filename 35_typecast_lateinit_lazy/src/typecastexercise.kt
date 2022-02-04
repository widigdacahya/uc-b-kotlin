import kotlin.random.Random

fun main(args: Array<String>) {

    val myCatAndDog = getAnimalsCatDog()
    myCatAndDog.forEach{ animal ->

        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()

    }

}

abstract class Animal

class Dog: Animal() {
    fun bark() {
        println("Dog is Barking")
    }
}

class Cat:Animal() {
    fun purr() {
        println("Cat is purring")
    }
}

fun getAnimalsCatDog(): ArrayList<Animal> {
    val listAnimal = arrayListOf<Animal>()
    for(i in 1..20) {
        listAnimal.add(
            if((Random.nextInt()%2 == 0))
                Dog()
            else
                Cat()
        )
    }
    return listAnimal
}