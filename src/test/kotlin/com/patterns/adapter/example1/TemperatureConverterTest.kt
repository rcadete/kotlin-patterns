package com.patterns.adapter.example1

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.slf4j.LoggerFactory
import java.util.*

class TemperatureConverterTest {

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
    fun testTemperatureConverter(){

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