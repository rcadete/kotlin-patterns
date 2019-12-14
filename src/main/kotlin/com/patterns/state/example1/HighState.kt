package com.patterns.state.example1

class HighState : FanState {
    override fun pull(fan: CeillingFan) {
        fan.currentState = OffState()
    }

    override fun toString(): String {
        return "HighState"
    }
}