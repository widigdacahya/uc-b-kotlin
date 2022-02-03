package com.cahyadesthian.data

import kotlin.random.Random

fun main(args: Array<String>) {
    val theArticle = arrayListOf<AnArticle>()
    theArticle.add(getAnArticle())
    theArticle.add(getAnArticle())

    val tempArrayNewName = arrayListOf<AnArticle>()


    for(theArtcle in theArticle) {
        val newArtc = theArtcle.copy(theTitle = theArtcle.theTitle + " new one")
        tempArrayNewName.add(newArtc)
    }

    theArticle.addAll(tempArrayNewName)

    theArticle.forEach { println(it) }
}


data class AnArticle(
    val theTitle: String,
    val theContent: String,
    val theReaders: Int
)


fun getAnArticle(): AnArticle {
    val randomTitleOfArticle = "The Title " + Random.nextInt(100)
    val randimNumberReader = Random.nextInt()
    return AnArticle(randomTitleOfArticle,"The Long COntent", randimNumberReader)
}