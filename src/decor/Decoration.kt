package decor

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



fun main() {
//    makeDecorations()
    makeLady()
}
