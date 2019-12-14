package com.patterns.builder.example2

import org.junit.Assert.*
import org.junit.Test

class PizzaTest {

    @Test
    fun testPizza(){
        // when
        val neapolitanPizza = Pizza.build {
            dough = "crust"
            sauce = "tomato"
            cheese = "mozzarella"
            toppings = "tomatoes, olive oil"
            garnish = "basil, leaves, oregano"
        }

        // then
        assertNotNull(neapolitanPizza)
        assertEquals("crust", neapolitanPizza.dough)
        assertEquals("tomato", neapolitanPizza.sauce)
        assertEquals("mozzarella", neapolitanPizza.cheese)
        assertEquals("tomatoes, olive oil", neapolitanPizza.toppings)
        assertEquals("basil, leaves, oregano", neapolitanPizza.garnish)
    }
}