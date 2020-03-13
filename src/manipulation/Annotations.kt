package manipulation

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet


@IamAPlant
class Plant {
    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false

    fun trim() {}
    fun fertilize() {}
}

fun testAnnotations() {
    // ::class gets info about a class at runtime
    val classObj = Plant::class
    for (method in classObj.declaredMemberFunctions) {
//        println(method.name)
    }

    // print annotations
    for ( annotation in classObj.annotations) {
//        println(annotation.annotationClass.simpleName)
    }

    val myAnnObject = classObj.findAnnotation<IamAPlant>()
    println(myAnnObject)




}

// simple annotation
annotation class IamAPlant

fun main() {
    testAnnotations()
}