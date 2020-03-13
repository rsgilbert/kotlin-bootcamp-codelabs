package extensions

fun makePartion(){
    val fishes = listOf(1, 2, 3, 4 ,5, 6)
    val twoLists = fishes.partition { it % 2 == 0 }
    println(twoLists)
}

fun main() {
    makePartion()
}