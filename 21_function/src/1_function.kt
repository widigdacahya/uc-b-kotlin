fun main(args: Array<String>) {

    /**
     *  group code that executed 0 or more
     *
     *  might not get same resul on different truns
     *
     *  can accept input and out put
     *
     *
     *
     * */
    for(i in 1..3) {

        greet()
    }


    var printaplhfivetime = 5
    do {
        printAplh()
        printaplhfivetime--
    } while(printaplhfivetime>0)

}

fun greet() {
    println("Hello everyone")
}

fun printAplh() {
    println("a,b,c,d,e,f,g,h,i,j,k,l,o,p,q,r,s,t,u,v,w,x,y,z")
}