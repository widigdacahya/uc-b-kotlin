fun main(args: Array<String>) {
    /*
    *
    * a farmer has 3 cows, which only one produce a milk
    * he has two childern
    * heis trying apply a funding with requiremnet are:
    * > must ghave nore than 5 animal
    * > animal mus produce something that can be sold
    * > regardlesss pf pther conditiom, funding will be approved if family has 3 or more numbers
    *
    * does farmer receive funding ?
    *
    *
    * */

    var farmerCow = 3
    var cowMilk = 1
    var farmerChild = 2
    var farmer = 1

    var req = ((farmerCow<=5) && (cowMilk>=1) )|| ((farmerChild+farmer)>=3)

    println("The Answer is $req")
}