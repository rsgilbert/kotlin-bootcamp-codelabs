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