package com.patterns.state.example2

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.slf4j.LoggerFactory
import java.util.*

class HeroTest {

    private lateinit var appender : InMemoryAppender

    @Before
    fun setup(){
        appender = InMemoryAppender()
    }

    @After
    fun tearDown(){
        appender.stop()
    }


    @Test
    fun testTimePasses(){
        val hero = Hero()

        hero.showMood()
        assertEquals("Hero is still!", appender.lastMessage)
        assertEquals(1, appender.logSize)

        hero.timePassed()
        hero.showMood()
        assertEquals("Hero is aggressive!", appender.lastMessage)
        assertEquals(2, appender.logSize)

        hero.getHit(3)
        hero.showMood()
        assertEquals("Hero is retrating!", appender.lastMessage)
        assertEquals(3, appender.logSize)

        hero.timePassed()
        hero.showMood()
        assertEquals("Hero is aggressive!", appender.lastMessage)
        assertEquals(4, appender.logSize)

        hero.getHit(8)
        hero.showMood()
        assertEquals("Hero is dead!", appender.lastMessage)
        assertEquals(5, appender.logSize)
    }


    @Test
    fun testToString(){
        val toString = Hero().toString()

        assertNotNull(toString)
        assertEquals("Hero", toString)
    }


    private inner class InMemoryAppender : AppenderBase<ILoggingEvent>() {
        private val log: MutableList<ILoggingEvent> = LinkedList()

        init {
            (LoggerFactory.getLogger("root") as Logger).addAppender(this)
            start()
        }

        val logSize: Int
            get() = log.size

        val lastMessage: String
            get() = log[log.size - 1].formattedMessage

        override fun append(iLoggingEvent: ILoggingEvent) {
            log.add(iLoggingEvent)
        }
    }
}