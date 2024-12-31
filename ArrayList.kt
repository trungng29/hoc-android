package com.example.tutorial30_12

fun main(args: Array<String>) {

    var age = ArrayList<Int>()

    age.add(10)
    age.add(1, 15)
    age.add(20)

/*

    println("First element of ArrayList = " + age[0])
    println("Second element of ArrayList = " + age[1])
    println("Third element of ArrayList = ${age[2]}")
*/

    age.remove(15)
    println(age.size)
    println("First element of ArrayList = " + age[0])
    println("Second element of ArrayList = " + age[1])
    println("----------------------------------------")

    var cars = arrayListOf<String>("Opel", "BMW")

    cars.add("Ford")
    println("First element of ArrayList = " + cars.get(0))
    println("First element of ArrayList = " + cars.get(1))
    println("First element of ArrayList = " + cars.get(2))

    var myMixArrayList = ArrayList<Any>()
    myMixArrayList.add("Ford")
    myMixArrayList.add(5)
    myMixArrayList.add(2.5)
    myMixArrayList.add(false)
    myMixArrayList.add('K')

}