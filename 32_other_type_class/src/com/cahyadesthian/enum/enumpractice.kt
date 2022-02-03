package com.cahyadesthian.enum

fun main(args: Array<String>) {
    var currState = GameState.STARTED

    for(i in 1..30) {
        //println(currState)
        println("Section ${i+1} -> Menu ${currState.ordinal+1} ${currState.name}")
        currState = changeState(currState)
    }
}

/*
* There is game that only 3 state
* > Start
* > Playing
* > Game Over
*
* it can only move in direction start->playing->game over
* so game class need
* */

fun changeState(currentStae: GameState) : GameState {
    when(currentStae) {
        GameState.STARTED -> return  GameState.PLAYING
        GameState.PLAYING -> return  GameState.GAMEOVER
        GameState.GAMEOVER -> return GameState.STARTED
    }
}

enum class GameState {
    STARTED,
    PLAYING,
    GAMEOVER
}