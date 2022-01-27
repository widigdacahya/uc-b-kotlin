package companionobject

fun main(args: Array<String>) {

    var aLaptop = LaptopJunio("Widigda")

    LaptopJunio.getLenovoInfo()

}

class LaptopJunio {

    var owner:String = ""

    init {
        println("The laptop is Junio, ideapad5,2021")
    }

    constructor() {
        println("Junio Called")
    }

    constructor(name:String) {
        this.owner = name
        println("Junio of $owner is referred")
    }

    fun getJunioInfo() {
        println("Junio is lenovo Ideapad 5 with 512 ssd and 8 Gb RAM")
    }

    companion object {
        fun getLenovoInfo() {
            println("Lenovo product build by heart of the engineer")
        }
    }
}