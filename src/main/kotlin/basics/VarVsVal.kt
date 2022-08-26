package basics

fun main() {
    varExample()
    valExample()
}

fun varExample() {
    var name: String = "Shivaprasad"
    println("Name before Edit = $name")
    name = "Bhat"
    println("Name after Edit = $name")
}

fun valExample() {
    val name = "Shivaprasad"
    println("Name before Edit = $name")
//    name = "Bhat"
//    Above assignment not possible as val is used to store one time value
//    e: /........../src/main/kotlin/basics/VarVsVal.kt: (18, 5): Val cannot be reassigned
//    Above error will be thrown if we try to compile
}