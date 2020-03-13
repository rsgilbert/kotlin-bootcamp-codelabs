package extensions

fun makeCol() {
    val list = listOf(1, 5, 6, 3)
    val strList = listOf("jack", "Kan", "PETER", "KONI", "Magician")
    println(strList.sumBy { it.length })
    println(list.sum())

    for (s in strList.listIterator(1)) println(s)

    val lovers = hashMapOf(Pair("Erena", "Damon"), "Caroline" to "Stephen", "Bonnie" to "Jeremy", 3 to "Tenis")
    println(lovers["Caroline"])
    println(lovers.get("Erena"))
    println(lovers.get("K"))
    println(lovers[3])
    println(lovers.getOrDefault("Step", "I donot know"))
}

fun makeInv() {
    val pair = Pair("1", "Miracles")
    val inventory = mutableMapOf("4" to "Turkey", pair)
    println(inventory)
    println(inventory["4"])
    inventory.remove("4")
    inventory["5"] = "Chicken"
    inventory["tick"] = "JINES"
    println(inventory)
    println(listOf(1, 2, 3,4).reversed())
}

fun main() {
//    makeCol()
    makeInv()
}