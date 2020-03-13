package extensions

import example.mycode.AquariumFish

fun String.hasSpaces() = find { it == ' ' } != null

open class Plant(val color: String, private val size: Int)

fun Plant.isRed() = color == "red"

val Plant.isBlue: Boolean
get() = color == "blue"

fun Plant?.pull() {
    this?.apply {
        println("removing $this")
    }
}
open class GreenPlant(size: Int) : Plant("green", size)

fun Plant.print() = println("I am a plant with the color $color")

fun GreenPlant.print() = println("I am a green plant")

fun main() {
    println("Do I have spaces".hasSpaces())
    val plant = Plant("blue", 2)
    println(plant.isRed())
    plant.print()
    println(plant.isBlue)

    val greenPlant = GreenPlant(10)
    greenPlant.print()
    println(greenPlant.isBlue)

    // when the plant p is null, will you pull?
    val p : Plant? = null
    p.pull()
}