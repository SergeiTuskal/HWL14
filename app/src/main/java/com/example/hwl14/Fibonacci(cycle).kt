package com.example.hwl14

fun main() {
    val n = 20
    var a1 = 0
    var a2 = 1

    print("Первые $n чисел Фибоначчи: ")

    for (i in 1..n) {
        print("$a1 ")
        val sum = a1 + a2
        a1 = a2
        a2 = sum
    }
}