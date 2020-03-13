package extensions

fun makePartition(){
    val fishes = listOf(1, 2, 3, 4 ,5, 6)
    val twoLists = fishes.partition { it % 2 == 0 }
    println(twoLists)
}

fun makePairs() {
    val eq = "Nice car" to "It is a mercedes"
//    println(eq.first)
//    println(eq.second)
//    println(eq)

    val myTriples = Triple("eyes", "nose", "mouth")
//    println(myTriples.first)
//    println(myTriples.second)
//    println(myTriples.third)
//    println(myTriples.toList())
//    println(myTriples.toString())
//    println(myTriples)

    val k = Pair(1, 2)
    println(k)
    val (one, two) = k
    println(two)
}
fun main() {
//    makePartition()
    makePairs()
}