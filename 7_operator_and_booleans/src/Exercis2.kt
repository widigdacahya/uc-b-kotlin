fun main(args: Array<String>) {
    var expr1 = 5.374*9.5847
//    println(expr1)
    var expr2 = 3.237 * 15.3726

    println("Is the expression1 ($expr1) is greater than expresion2($expr2)? The anwser is ${ expr1 > expr2 }")

    //second question
    val isThisTrueOrFalse = ((true&&false)||(false||true))
    println("The Second is $isThisTrueOrFalse")

    //third question
    var thirdExpression = !( (3>=3)&&(false||(2<5)) )
    println("The Third gonna be $thirdExpression")

    //forth question
    /*
    * child hace two toys, of whicj one is broken,
    * the parrents will only buy a new toy if he has less than 5 and at least one is not broken
    * Will the choild get a new toy?
    *
    * */
    var childToy = 2
    var brokenToy = 1
    var notBrokenToy = childToy-brokenToy
    var parrentBuy = ((childToy<5) && (notBrokenToy>=1) )
    println("Fortsh Story question is $parrentBuy")
}