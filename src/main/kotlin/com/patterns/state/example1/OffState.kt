package com.patterns.state.example1

class OffState : FanState {
    override fun pull(fan: CeillingFan) {
        fan.currentState = LowState()
    }

    override fun toString(): String {
        return "OffState"
    }
}