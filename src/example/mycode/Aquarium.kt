package example.mycode

class Aquarium (var width: Int = 100, var length: Int = 200, var height: Int = 1){
    val volume: Int
        get() = width * length * height

    init {
        println("Aquarium starting..")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }


    fun printSize() {
        println("Width: $width cm Length: $length cm" +
                " Height: $height cm Volume: $volume")
    }
}