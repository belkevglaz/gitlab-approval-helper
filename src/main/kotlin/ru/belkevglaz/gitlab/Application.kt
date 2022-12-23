package ru.belkevglaz.gitlab

import io.ktor.server.application.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.request.*
import io.ktor.util.logging.*
import org.slf4j.event.*
import ru.belkevglaz.gitlab.plugins.configureRouting

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)


@Suppress("unused")
fun Application.module() {

	configureRouting()

}
