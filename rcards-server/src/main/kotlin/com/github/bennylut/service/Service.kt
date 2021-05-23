package com.github.bennylut.service

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

object Service {
    fun start() = embeddedServer(Netty, port = 8081) {
        routing {
            get("/") {
                call.respondText("Hello world")
            }
        }
    }.start(wait = true)
}