package com.patterns.builder.example1

import org.junit.Test

import org.junit.Assert.*

class PizzaTest {

    @Test
    fun testPizza() {
        // when
        val neapolitanPizza = Pizza.PizzaBuilder()
                .withDough("crust")
                .withSauce("tomato")
                .withCheese("mozzarella")
                .withToppings("tomatoes, olive oil")
                .withGarnish("basil, leaves, oregano")
                .build()

        // then
        assertNotNull(neapolitanPizza)
        assertEquals("crust", neapolitanPizza.dough)
        assertEquals("tomato", neapolitanPizza.sauce)
        assertEquals("mozzarella", neapolitanPizza.cheese)
        assertEquals("tomatoes, olive oil", neapolitanPizza.toppings)
        assertEquals("basil, leaves, oregano", neapolitanPizza.garnish)
    }
}