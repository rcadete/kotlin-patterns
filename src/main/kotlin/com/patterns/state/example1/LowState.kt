package com.patterns.state.example1

class LowState : FanState {
    override fun pull(fan: CeillingFan) {
        fan.currentState = MediumState()
    }

    override fun toString(): String {
        return "LowState"
    }
}