package com.example.tutorial30_12

fun main(args: Array<String>) {

    // immutable
    var age = mapOf<String, Int>("david" to 20, "ronaldo" to 25)

//    var map1 = mapOf("david" to true, 20 to 10, 'K' to "ppppp")

    println("age of david = " + age["david"])
    println("age of ronaldo = " + age["ronaldo"])

    // mutable
    var mutableAge: MutableMap<String, Int> = mutableMapOf("david" to 20, "ronaldo" to 25)

    mutableAge.put("buffon", 30)

    println("age of david = " + mutableAge["david"])
    println("age of ronaldo = " + mutableAge["ronaldo"])
    println("age of buffon = " + mutableAge["buffon"])

    var a = 20
    var b = 1000
    var c = "trung"


}