package conditionals

fun main() {
    kotlinWhen()
    whenWithRange()
}


fun kotlinWhen() {
    val name = "shivaprasad"

    when (name) {
        "shivaprasad" -> {
            println("Name is Shivaprasad")
        }

        "dhoni" -> println("Name is Dhoni")
        else -> "I don't know the name"
    }
}

fun whenWithRange() {
    val age = 11
    when (age) {
        in 1..10 -> {
            println("age is between 1 and 10")
        }

        in 11..20 -> {
            println("age is between 11 and 20")
        }

        else -> println("age is greater than 20")
    }

}
