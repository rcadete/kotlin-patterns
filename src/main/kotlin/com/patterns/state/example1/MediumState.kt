package com.patterns.state.example1

class MediumState : FanState {
    override fun pull(fan: CeillingFan) {
        fan.currentState = HighState()
    }

    override fun toString(): String {
        return "MediumState"
    }
}