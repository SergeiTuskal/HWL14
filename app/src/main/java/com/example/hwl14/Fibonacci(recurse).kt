package com.example.hwl14

val m = 20
var b1 = 0
var b2 = 1
var count = 1

fun main() {
    print("Первые $m чисел Фибоначчи: ")
    var result = recurse()
}

fun recurse() {
    print("$b1 ")
    val sum = b1 + b2
    b1 = b2
    b2 = sum
    count += 1
    if (count <= m) recurse()
}