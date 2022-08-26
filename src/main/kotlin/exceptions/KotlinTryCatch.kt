package exceptions

fun main() {
//    simpleTryCatch()
    multipleCatch()
}

fun simpleTryCatch() {
    try {
        10 / 0
    } catch (e: Exception) {
        println(e)
        println(e.message)
        println(e.printStackTrace())
    }
}

fun multipleCatch() {
    try {
        10 / 0
    } catch (e: ArithmeticException) {

        println("Message : ${e.message}, Class : ${ArithmeticException::class.java.simpleName}")
    } catch (e: Exception) {
        println("Message : ${e.message}, Class : ${Exception::class.java.simpleName}")

    }
}