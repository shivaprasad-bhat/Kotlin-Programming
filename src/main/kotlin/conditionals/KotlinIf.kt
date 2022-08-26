package conditionals

fun main() {
    simpleIf()
    ifElse()
    ifElseLadder()
}

fun simpleIf() {
    val age = 25

    // Simple if
    if (age > 20) {
        println("Age is greater than 20")
    }
}

fun ifElse() {
    val age = 25
    if (age > 25) {
        println("Age is greater than 25")
    } else {
        println("Age is less than 25")
    }

    val isMarried = true
    if (isMarried) {
        println("Married")
    } else {
        println("Single")
    }
}

fun ifElseLadder() {
    val age = 16
    if (age > 25) {
        println("Age is greater than 25")
    } else if (age > 20 && age <= 25) {
        println("Age falls in the range of 20 - 25")
    } else if (age > 15 && age <= 20) {
        println("Age falls in the range of 15 - 20")
    } else {
        println("Age is less than 15")
    }
}