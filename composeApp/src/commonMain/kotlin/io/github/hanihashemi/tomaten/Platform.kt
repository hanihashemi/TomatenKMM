package io.github.hanihashemi.tomaten

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform