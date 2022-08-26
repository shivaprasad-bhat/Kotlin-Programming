package loops

fun main() {
    for (n in 1..10) {
        println(n)
    }

    val arr = arrayOf("a", "b", "c", "d")
    for (element in arr) {
        println("Element is $element")
    }

    val listOfAges = listOf(22, 25, 30, 50, 77)
    for (age in listOfAges) {
        println("Age is $age")
    }

    // Iterate with index
    for (index in listOfAges.indices) {
        println("$index")
    }

    // Gives you back the range
    println(listOfAges.indices)

    // Possible, data type in Kotlin
    val range = 0..4

    // withIndex iteration
    for ((index, value) in listOfAges.withIndex()) {
        println("Index = $index, Value = $value")
    }
}