package basics

fun main() {
    integer()
    double()
    float()
    bool()
    long()
}

/**
 * Int
 */
fun integer() {
    var number: Int = 10
    var age = 20        // Explicit type declaration is not needed

    println("Number is $number and age is $age")
}

/**
 * Double
 */
fun double() {
    var efficiency = 22.2
    println("Efficiency = $efficiency")
}

/**
 * Float
 */
fun float() {
    var salary = 22000f
    println("Salary = $salary")
}

/**
 * Boolean
 */
fun bool() {
    var isMarried = false
    println("Marital status is $isMarried")
}

/**
 * Long
 */
fun long() {
    var salary = 1260201L
    println("Salary is $salary")
}