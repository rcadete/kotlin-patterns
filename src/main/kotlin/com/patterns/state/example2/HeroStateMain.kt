package com.patterns.state.example2

fun main(){

    val hero = Hero()

    hero.showMood()
    hero.timePassed()
    hero.showMood()
    hero.getHit(3)
    hero.showMood()
    hero.timePassed()
    hero.showMood()
    hero.getHit(8)
    hero.showMood()
}