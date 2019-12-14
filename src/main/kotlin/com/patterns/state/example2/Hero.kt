package com.patterns.state.example2

class Hero {

    private var mood: Mood = Still(this)
    private var heathPoints = 5

    fun timePassed(){
        mood = when(mood){
            is Still -> Aggressive(this)
            is Aggressive -> mood
            is Retreating -> Aggressive(this)
            is Dead -> mood
        }
    }

    fun getHit(damagePoints: Int){
        heathPoints -= damagePoints

        mood = when {
            (heathPoints <= 0) -> Dead(this)
            mood is Aggressive -> Retreating(this)
            else -> mood
        }
    }

    fun showMood(){
        this.mood.observe()
    }

    override fun toString(): String {
        return "Hero"
    }
}