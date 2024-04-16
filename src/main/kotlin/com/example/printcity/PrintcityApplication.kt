package com.example.printcity

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PrintcityApplication

fun main(args: Array<String>) {
   println("Enter your city..")
    val city = readln();
    println("User lives in $city!");
}
