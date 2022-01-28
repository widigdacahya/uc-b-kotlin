package com.cahyadesthian.kotlin.abstraction.practice

fun main(args: Array<String>) {

    val myPug = Pug("Pug Sassy")
    val myBassetHound: Dog = BassetHound("Basset Hound Candra")
    val myChihuahua: OldChihuahua = OldChihuahua("Chihuahua Puppi")

    myPug.bark()
    myPug.run()
    myPug.play()

    myBassetHound.bark()
    myBassetHound.run()
    myBassetHound.play()

    myChihuahua.bark()
    myChihuahua.run()
    myChihuahua.play()

}


abstract class Dog(kind: String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()

}

class Pug(val name:String): Dog(name) {
    override fun run() {
        println("a $name can run")
    }

    override fun bark() {
        println("a $name can't bark")
    }

    override fun play() {
        println("a $name can play")
    }

}

class BassetHound(val bhoundName:String) : Dog(bhoundName) {
    override fun run() {
        println("a $bhoundName can't run")
    }

    override fun bark() {
        println("a $bhoundName can bark")
    }

    override fun play() {
        println("a $bhoundName can play")
    }

}

class OldChihuahua(val chiName: String) : Dog(chiName) {
    override fun run() {
        println("a $chiName can run")
    }

    override fun bark() {
        println("a $chiName can bark")
    }

    override fun play() {
        println("a $chiName can't play")
    }

}