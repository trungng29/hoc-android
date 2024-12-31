package com.example.tutorial30_12

fun main(args: Array<String>) {
/*
    var mySetArray = arrayListOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")

    println(mySetArray.size)
    println(mySetArray.last())
    */

    var mySetArray = setOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")

    for ( tmp: Any in mySetArray ) {
        println(tmp)
    }
    println(mySetArray.size)
    println(mySetArray.last())

}