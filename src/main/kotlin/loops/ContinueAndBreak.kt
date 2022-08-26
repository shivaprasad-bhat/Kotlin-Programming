package loops

fun main() {
//    kotlinContinue()
//    kotlinBreak()
    continueWithNestedLoop()
}

fun kotlinContinue() {
    for (i in 1..20) {
        if (i % 2 == 0)
            continue    // skips the iteration
        println("i = $i")
    }
}

fun kotlinBreak() {
    for (i in 1..100) {
        if (i == 8)
            break
        println("i = $i")
    }
}

fun continueWithNestedLoop() {
    for (char in 'a'..'d') {
        if (char == 'b') {
            continue
        }
        for (num in 1..4) {
            if (num == 2 || num == 4)
                continue
            println("char = $char & num = $num")
        }
    }
}