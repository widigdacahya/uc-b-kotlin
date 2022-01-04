fun main(args: Array<String>) {

    /**
     * Operator- Arugmented Assignment
     *
     *  +=
     *  -=
     *  *=
     *  /=
     *  %=
     *
     * */

    var cats = 4

    cats + 1
    println(cats) //there is no assigment, hence the cats is stil four

    //println( " if assignemnt augmented " + (cats+=1)) //error assignment is not expression
    cats +=2
    println("Now my cats are $cats")

    cats -=3
    println("3 of my cat are run away,. so now, there are $cats in my home")

    cats /= 2
    println("Can we divide it by 2? the anser is $cats")

    cats %=2
    println("Let see if the number of the cat mod by 2, it is $cats")

}