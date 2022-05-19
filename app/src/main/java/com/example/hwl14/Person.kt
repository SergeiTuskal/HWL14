package com.example.hwl14

import kotlin.random.Random

open class Person (val height: Int, val weight: Int)

fun main() {
    var sum = 0
    fun Person.getHeightWeightExtensions() = height + weight
    for (i in 1..3) {
        val height = Random.nextInt(150, 190)
        val weight = Random.nextInt(50, 90)
        val person = Person(height, weight)
        sum += person.getHeightWeightExtensions()
        println("$i. Рост - ${person.height} см, вес - ${person.weight} кг")
    }
    println("Сумма полей - $sum")
}