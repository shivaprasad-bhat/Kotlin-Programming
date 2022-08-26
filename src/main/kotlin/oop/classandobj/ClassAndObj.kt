package oop.classandobj

class ClassAndObj {
    private var number: Int = 10
    override fun toString(): String {
        return "Number = $number"
    }
}

fun main() {
    val obj1 = ClassAndObj()
    println(obj1)       // Calls toSting() internally
    // If toString() is not overridden, prints the object id
    println(obj1.toString())        // Overridden
}