fun main() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))


    var newDirtyLevel = waterFilter2(100)
    println(newDirtyLevel)

    val newDirty = updateDirty(16, waterFilter2)
    println("Updated Dirty is $newDirty")

    // Using regular function
    // Use :: to tell Kotlin that you are passing a function
    // reference as arg, but not trying to call the function
    val up = updateDirty(28, ::incrementDirty)
    println("Incremented dirty is $up")

    // Last parameter call syntax
    // Here you pass a lambda for the function parameter
    // but you don't need to put the lambda inside the parentheses
    var myDirtyLevel = 10
    var myUpdatedDirtyLevel = updateDirty(myDirtyLevel) { dirtyLevel -> dirtyLevel + 28}
    println("My updated dirty level is $myUpdatedDirtyLevel")
}
// lambda function
val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }

// Regular named function
fun incrementDirty(start: Int) = start + 1

// higher order function. U ses function as parameter
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}