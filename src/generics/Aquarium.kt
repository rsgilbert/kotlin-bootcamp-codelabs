package generics


open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(needsProcessing = true) {

    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(needsProcessing = false)

class LakeWater : WaterSupply(needsProcessing = true) {

    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
//        check(!waterSupply.needsProcessing) {
//            cleaner.clean(waterSupply)
//        }
        if(waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("Added water from $waterSupply")
    }
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item added")

fun genericsExample() {
    val aquarium = Aquarium(LakeWater())
    println(aquarium.waterSupply)
    aquarium.waterSupply.filter()
    println(aquarium.waterSupply.needsProcessing)
//    aquarium.addWater()
}

fun inAndOutExample() {
    val aq = Aquarium(TapWater())
    addItemTo(aq)
}

fun genExample2() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
}
fun main() {
//    genericsExample()
//    inAndOutExample()
    genExample2()
}
