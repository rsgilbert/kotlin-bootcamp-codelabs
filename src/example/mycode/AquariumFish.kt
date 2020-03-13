package example.mycode

abstract class AquariumFish {
    abstract val color: String
}

class Shark : FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat other fish")
    }
}

class Plescostomus(fishColor: FishColor = GoldColor) : FishColor by fishColor,
        FishAction by PrintingFishAction("mosquito larvae")

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "pink"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println("I eat $food")
    }
}

// sealed class
// A sealed class can only be subclassed from inside the file it is declared
sealed class Seal {
   val name = " The Big seal "
}

open class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "Walrus it is"
        is SeaLion -> "Turns out it is a sea lion"
    }
}
fun main() {
    println(matchSeal(SeaLion()))
}