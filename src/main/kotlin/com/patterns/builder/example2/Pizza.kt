package com.patterns.builder.example2


class Pizza(var dough: String? = null,
            var sauce: String? = null,
            var cheese: String? = null,
            var toppings: String? = null,
            var garnish: String? = null) {

    private constructor(builder: PizzaBuilder) : this(
            builder.dough,
            builder.sauce,
            builder.cheese,
            builder.toppings,
            builder.garnish
    )

    companion object {
        inline fun build(block: PizzaBuilder.() -> Unit) = PizzaBuilder().apply(block).build()
    }

    class PizzaBuilder {
        var dough: String? = null
        var sauce: String? = null
        var cheese: String? = null
        var toppings: String? = null
        var garnish: String? = null

        fun build() = Pizza(this)
    }
}