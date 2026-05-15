package com.example

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    install(ContentNegotiation) {
        json()
    }
    routing {
//        get("/") {
//            call.respondText("Hello, World!")
//        }
        get("/api/v1/media-data") {
            call.respond(
                listOf(
                    MediaStorage(1, "https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4", "Watch this cute cat doing trick #Cats #Funny", "video"),
                    MediaStorage(2, "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3", "Start your day with this amazing podcast #MorningMotivation", "audio"),
                    MediaStorage(3, "/Mohammed_Ibrahim_CV.pdf", "Mohammed Ibrahim's CV", "document"),
                    MediaStorage(4, "", "Just finished building this awesome app! Feeling proud of what we've accomplished. The journey of learning Flutter has been amazing. #FlutterDev #MobileApps #CodingLife", "text")
                )
            )
        }
    }
}