package com.cahyadesthian.data

import kotlin.random.Random

//[error when runn]
/*
*
* Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at com.cahyadesthian.data.DataclassexerciseKt.main(dataclassexercise.kt:36)
*
*
* */

fun main(args: Array<String>) {

    var articles = arrayListOf<Article>()
    articles.add(getArticle())
    articles.add(getArticle())

    println(articles)

//    for (tex:Article in articles) {
//        val newArticle:Article = tex.copy(titles = "${tex.titles} new name" )
//        articles.add(newArticle)
//    }


    articles.forEach {
        var newName = it.copy(titles = "New title from ${it.titles}")
        articles.add(newName)
    }
}

fun getArticle():Article {
    val randTitle = "Title " + Random.nextInt(100)
    val numberOfReader = Random.nextInt(951)
    return Article(randTitle, "Some Content Text", numberOfReader)
}

data class Article(
    val titles:String,
    val contents:String,
    val numberOfReaders:Int
)