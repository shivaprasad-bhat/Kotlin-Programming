package lambda

fun main() {
    greet()

    // Another way of invoking
    greet.invoke()

    println(sum(10, 10))
    println(sub(10, 10))
    display("Shivaprasad")
    "Shivaprasad".showName()
}

val greet = {
    println("Greetings")
}

// Parameters - 1
val sum = { a: Int, b: Int ->
    a + b
}

// Parameters - 2
val sub: (Int, Int) -> Int = { a, b ->
    a - b
}

// Parameter - 3
val display = fun(name: String): Unit {
    println(name)
}

// Extension
val showName: String.() -> Unit = {
    println(this)
}