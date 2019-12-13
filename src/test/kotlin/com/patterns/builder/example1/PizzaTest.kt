package com.patterns.builder.example1

import org.junit.Test

import org.junit.Assert.*

class PizzaTest {

    @Test
    fun testPizza() {
        // when
        val neapolitanPizza = Pizza.PizzaBuilder()
                .withDough("cross")
                .withSauce("")
                .withCheese("mozzarella")
                .withToppings("tomatoes, olive oil")
                .withGarnish("basil, leaves, oregano")
                .build()

        // then
        assertNotNull(neapolitanPizza)
        assertEquals("cross", neapolitanPizza.dough)
        assertEquals("", neapolitanPizza.sauce)
        assertEquals("mozzarella", neapolitanPizza.cheese)
        assertEquals("tomatoes, olive oil", neapolitanPizza.toppings)
        assertEquals("basil, leaves, oregano", neapolitanPizza.garnish)
    }
}