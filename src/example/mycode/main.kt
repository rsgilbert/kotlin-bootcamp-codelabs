package example.mycode

fun buildAquarium() {
    val myAquarium = Aquarium(height = 2)
    myAquarium.printSize()
    myAquarium.width = 100
    myAquarium.printSize()

    val aq2 = Aquarium(numberOfFish = 64)
    aq2.printSize()
}

fun main() {
    buildAquarium()
}