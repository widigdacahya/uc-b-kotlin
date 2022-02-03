package typeparameter

/*
* Abstract class shape define methood getArea thath take argument size
*
* two subclasses Square and Circle
* inherti from shape
*
* Class geometu take generic argument type shape
* emthod to print area of shape
*
* */

fun main(args: Array<String>) {


    val geoOne = Geometry<Square>()
    geoOne.getMessage(Square(), 9.0)

    val geoTwo = Geometry<Circle>()
    geoTwo.getMessage(Circle(),7.0)


    val geoThree = Geometry<Square>()
    geoThree.getMessage(Square(),9.2)
}

abstract class Shape {
    abstract fun getArea(size: Double): Double
}

class Square: Shape() {
    override fun getArea(size: Double): Double {
        println("Processing Square [] ")
        return size*size
    }

}

class Circle:Shape() {
    //override fun getArea(size: Double): Double = size * size * 3.1415
    override fun getArea(size: Double): Double {
        println("() Proceeed :D")
        return size*size*3.1415
    }

}


class Geometry<T:Shape> {
    fun getMessage(shape: T, sizeOfShape: Double) {
        println("The area of the sahpe is ${shape.getArea(sizeOfShape)}")
    }
}