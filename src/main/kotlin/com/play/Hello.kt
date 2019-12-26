package com.play

fun main() {
//    println("Hello Kotlin");
    Human(66.5f,1.5f).hello();
    var h = Human(66.2f,1.8f);

    var g = Human();

    var i = Human(weight = 1.1f,name="12321");
    h.hello();
    println(h.bmi())
//    var age : Int = 19;
//    age = 20;
//    var weight = 66.5f;
//    var name : String;
//    name = "Kevin";


}
class Human(var weight : Float = 0.1f , var height : Float = 54.0f, var name:String = ""){
    init{
        println("test" + weight + "$height" )

    }
//    constructor(name:String ,weight: Float,height: Float):this(weight,height)
    fun hello(){
        println("Hello Kotlin My Friend")
    }
    fun bmi() : Float{
        val bmi = weight/(height*height)
        return bmi
    }
}