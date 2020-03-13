package example.mycode

fun buildAquarium() {
//    val myAquarium = Aquarium(height = 2)
//    myAquarium.printSize()
//    myAquarium.width = 100
//    myAquarium.printSize()
//
//    val aq2 = Aquarium(numberOfFish = 64)
//    aq2.printSize()
//    aq2.volume = 500_000
//    aq2.printSize()

    // tower tank
    val myTower = TowerTank(diameter = 50, height = 30)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plescostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
    shark.eat()
    pleco.eat()

}

fun main() {
    makeFish()
//    buildAquarium()
}
