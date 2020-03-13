package manipulation

data class Fish(var name: String)

fun fishExamples() {
    val fish = Fish("splashy") // lowercase
    with(fish.name) {
        println(toUpperCase())
    }

}

// greatly simplified version of with()
// accepts an object, followed by an extension function
// the extension function is applied to that object
// marked as inline to make the compiler inline the function
// ie. the compiler will change the code to replace the lambda
// with the instructions inside the lambda
// this could reduce overhead during runtime hence faster execution
inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun useMyWith() {
    val egg = "A round sweet egg"
    myWith(egg) {
        println(length)
    }
}

fun useRun() {
    var fish = Fish("Octopops")

    // takes one lambda as arg
    // returns the result of executing the lambda
    val l = fish.run {
        name.length
    }
    println("Length is $l")
}

// Returns the changed object it was applied to
// instead of the result of the lambda
// NOTE: Apply modifies the object
fun useApply() {
    val fish = Fish("Eel")
    println("Immediate fish is $fish")
    fish.apply {
        name = "Whale"
    }
    println("New fish is $fish")
}

// Returns a copy of the object with the changes
fun useLet() {
    val fish = Fish("Shark")
    println("Immediate Fish is $fish")

    // returns a copy of the object as `it` for manipulation
    val fishName: String = fish
        .let {
            "${it.name} of the Damned"
        }
        .let {
            it.capitalize()
        }
    println(fishName)
    println("Fish is $fish")

}


// using the elongated version of myWith
// note that we used inline on myWith so the
// code in myWith will be inlined by the compiler
fun longMyWith() {
    var fish = Fish("hipO")
    myWith(fish.name, object: Function1<String, Unit> {
        override fun invoke(name: String) {
            println(name.capitalize())
        }
    })
}

fun main() {
//    fishExamples()
//    useMyWith()
//    useRun()
//    useApply()
//    useLet()
    longMyWith()

}
