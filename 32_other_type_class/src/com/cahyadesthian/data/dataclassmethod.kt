package com.cahyadesthian.data

/*
* .equals() or ==
* compares data not object references
*
* .toString()
* print out variable names and data
*
* .copy()
* creates a copy with only some data changed
*
* */

fun main(args: Array<String>) {

    val phone1 = Phone("Realmi8", 2500000)

    val phoner2 = Phone("Realme8i", 2100000)

    println(phoner2.brand)
    println(phone1.brand)
    print("So both of them same? ${phone1.equals(phoner2)}")

    val phone3 = Phone("Realmi8", 2500000)
    println("\nNext comparison is ${phone1.brand} with ${phone3.brand} is same ? ${phone1 == phone3}")


    print("\n")
    val phone4 = PhoneRegClass("Lenovo", 9000000)
    println(phone4)
    println(phone4.toString())
    //both of above print  same thongs

    println()
    val phone5 = Phone("Samsung", 8990000)
    println(phone5)
    println(phone5.toString())
    //both of above print  same things

    println()
    println("Copy")
    val phone6 = phone5.copy()
    println(phone6)

    val phone7 = phone5.copy(brand = "Nokia")
    println(phone7)

    println(phone5)

}


data class Phone(
    val brand: String,
    val Price: Int
)

class PhoneRegClass(
    val aBranc : String,
    val aPrice:Int
)