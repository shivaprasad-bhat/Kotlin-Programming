package io

import java.util.*

fun main() {
    print("Please enter a name: ")
    val name = readln()             // Returns String
    println("Name entered by you is $name")

    print("Please enter your age: ")
    // Integer.valueOf() - throws exception if a non-numerical value entered as it will not able to parse
    // readLine()?.toInt() is also possible
    // readln().toInt() is also possible, ?. condition is not required
    val age = Integer.valueOf(readLine()) // Returns String?
    println("Your age is $age")

    // We can also use Java's Scanner class as well
    // need to use functions like nextInt(), nextFloat() to read the value
    print("Enter your salary: ")
    val scanner = Scanner(System.`in`)
    val salary = scanner.nextFloat()
    println("Salary is $salary")
    scanner.close()
}