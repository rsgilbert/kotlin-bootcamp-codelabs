package example.mycode

import kotlin.math.PI

open class Aquarium (open var width: Int = 100, open var length: Int = 200, open var height: Int = 1){
    open var volume: Int
        get() = width * length * height
        set(value) {
            height = value / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.5

    init {
        println("Aquarium starting..")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }


    fun printSize() {
        println("Width: ${width}cm Length: $length cm" +
                " Height: $height cm")
        println("Volume: $volume Water: $water")
    }
}

class TowerTank (override var height: Int, var diameter: Int) : Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
    // ellipse area = PI * r1 * r2
    get() = (width / 2 * length / 2 * height * PI).toInt()
    set(value) {
        height = ((value / PI) / (width / 2 * length / 2)).toInt()
    }
    override var water = volume * 0.75

    override val shape = "cylinder"


}