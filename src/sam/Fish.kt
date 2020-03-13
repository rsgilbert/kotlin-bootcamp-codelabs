package sam

fun runExample() {
    val runnable = object: Runnable {
        override fun run() {
            println("I'm a Runnable")
        }
    }

    JavaRun.runNow(runnable)

    // alternatively, use lambda
    JavaRun.runNow {
        println("Howdy lambda")
    }
}

fun main() {
    runExample()
}

