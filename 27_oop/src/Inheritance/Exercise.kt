package Inheritance

import javax.print.Doc

fun main(args: Array<String>) {

    var people1 = Doctor()
    var people2 = Engineer()

    people1.name = "Doctor Cahyadesthian"
    people2.name = "Sir Widigda S.Kom. M.Kom"

    people1.salary = 10000000
    people2.salary = 9500000

    people1.work()
    people2.work()
    println("${people1.name} with salary ${people1.salary} and ${people1.revenue}")
    println("${people2.name} with salary ${people2.salary} and ${people2.revenue}")
    println("Then people 2 study a lot")
    people2.study()
    people2.study()
    people2.study()
    people2.study()
    println()
    print("\nNOw then they work\n")
    people1.work()
    people2.work()
    println("${people1.name} with salary ${people1.salary} and ${people1.revenue}")
    println("${people2.name} with salary ${people2.salary} and ${people2.revenue}")


}

open class Job {
    var name = "A Job"
    var revenue = 0
    var salary = 5000000

    fun work() {
        revenue += salary
        println("$name revenue -------> $revenue")
    }

    fun study() {
        salary+= 1000000
        println("$name salary -------> $salary")
    }
}

class Doctor: Job() {

}

class  Engineer: Job() {

}