package com.example.demo1.extensions

fun String.hello() : String {
    return "Hello $this"
}

infix fun String.getLongerStringLength(v: String) : Int =
        if(this.length > v.length) this.length else v.length
