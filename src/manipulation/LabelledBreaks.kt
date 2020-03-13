package manipulation

fun labels() {
    myOuterLoop@ for (i in 1..10) {
        print(" i $i ")
        for (j in 1 .. 5) {
            print("j $j ")
            if (i > 3) {
                break@myOuterLoop
            }
        }
        println()
    }
}

fun practiceJoin() {
    val names = listOf("Peter", "AB", "Camara", "Mary", "PI", "Trinity", "Mark", "John")
    val s = names
        .filter { it.length > 3 }
        .joinToString(" - ") { it.length.toString() }
    println(s)
}

fun main() {
//    labels()
    practiceJoin()
}