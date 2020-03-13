package decor

import example.mycode.SeaLion
import example.mycode.Seal

data class Decoration(val rocks: String) {

}

fun makeDecorations() {
    val decoration1 = Decoration("Granite")
    val dec2 = Decoration("mayinja")
    val dec3 = Decoration("quartz")
    val dec4 = Decoration("quartz")
    println(decoration1)
    println(dec2)
    println(dec3)
    println(dec4)
    println(dec2 == dec3)
    println(dec3 == dec4)
}
data class Lady(val name: String, val age: Int, val course: String)

fun makeLady() {
    val dyson = Lady("Dyson", 19, "BIST")
    val (herName, herAge, _) = dyson

    println(dyson)
    println(herName)
    println(herAge)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

class L: SeaLion()


fun main() {
//    makeDecorations()
//    makeLady()
    println(Direction.EAST.name)
    println(Direction.SOUTH.ordinal)
    println(Direction.WEST.degrees)
    println(L().name)
}
