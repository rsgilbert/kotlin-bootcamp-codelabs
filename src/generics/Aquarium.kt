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

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("Needs cleaning: ${aquarium.waterSupply.needsProcessing}")
}

// extension function using reified types
inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

// using star projection
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R


fun testGenFun() {
    val aq = Aquarium(TapWater())
    val aq2 = Aquarium(LakeWater())
    aq.waterSupply.addChemicalCleaners()
    isWaterClean(aq)
    isWaterClean(aq2)
}

fun testGenFun2() {
    val aq = Aquarium(TapWater())
    println(aq.hasWaterSupplyOfType<FishStoreWater>()) // returns false
}

fun testExtFun() {
    val aq = Aquarium(LakeWater())
    println(aq.waterSupply.isOfType<LakeWater>())
    println(aq.waterSupply.isOfType<TapWater>())
    println(aq.waterSupply.isOfType<WaterSupply>())
    println(aq.waterSupply.isOfType<FishStoreWater>())

    // testing hasWaterSupplyOf
    println(aq.hasWaterSupplyOfType<LakeWater>())
    println(aq.hasWaterSupplyOfType<TapWater>())
}

fun main() {
//    genericsExample()
//    inAndOutExample()
//    genExample2()
//    testGenFun()
//    testGenFun2()
    testExtFun()
}

