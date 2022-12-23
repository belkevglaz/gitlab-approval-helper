package ru.belkevglaz.gitlab.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

	routing {

		get("/") {
			call.respondText("Hello World!")
		}

		post("/") {

			this@configureRouting.log.info(call.receive())

			call.respondText("I have got message via POST method")
		}
	}
}
