package com.patterns.state.example1

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import com.patterns.state.example2.Hero
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.slf4j.LoggerFactory
import java.util.*

class CeillingFanTest {

    private lateinit var appender: InMemoryAppender

    @Before
    fun setup() {
        appender = InMemoryAppender()
    }

    @After
    fun tearDown() {
        appender.stop()
    }


    @Test
    fun testTimePasses() {
        val fan = CeillingFan()

        fan.pull()
        assertEquals("state: LowState", appender.lastMessage)
        assertEquals(1, appender.logSize)

        fan.pull()
        assertEquals("state: MediumState", appender.lastMessage)
        assertEquals(2, appender.logSize)

        fan.pull()
        assertEquals("state: HighState", appender.lastMessage)
        assertEquals(3, appender.logSize)

        fan.pull()
        assertEquals("state: OffState", appender.lastMessage)
        assertEquals(4, appender.logSize)
    }


    @Test
    fun testToString() {
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