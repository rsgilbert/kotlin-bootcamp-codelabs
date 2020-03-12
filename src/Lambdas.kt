fun main() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))


    var newDirtyLevel = waterFilter2(100)
    println(newDirtyLevel)

    val updatedDirty = updateDirty(16, waterFilter2)
    println("Updated Dirty is $updatedDirty")
}
// lambda function
val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }

// higher order function. Uses function as parameter
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}