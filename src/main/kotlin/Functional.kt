package com.hedev.resuable

public inline fun <T> T.pipe(block: (T) -> Unit): T {
    block(this)
    return this
}