package com.patterns.builder.example1

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

    class PizzaBuilder {
        var dough: String? = null
            private set
        var sauce: String? = null
            private set
        var cheese: String? = null
            private set
        var toppings: String? = null
            private set
        var garnish: String? = null
            private set

        fun withDough(dough: String?): PizzaBuilder {
            this.dough = dough
            return this
        }

        fun withSauce(sauce: String?): PizzaBuilder {
            this.sauce = sauce
            return this
        }

        fun withCheese(cheese: String?): PizzaBuilder {
            this.cheese = cheese
            return this
        }

        fun withToppings(toppings: String?): PizzaBuilder {
            this.toppings = toppings
            return this
        }

        fun withGarnish(garnish: String?): PizzaBuilder {
            this.garnish = garnish
            return this
        }

        fun build() = Pizza(this)
    }
}