package com.kk.plugins

import com.kk.SlackMessageSender
import com.kk.sendMessage
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    routing {
        get("/message") {
            val message:String = call.request.queryParameters["message"].orEmpty()


            println(message)
            SlackMessageSender.sendMessage(message)
        }

    }
}
