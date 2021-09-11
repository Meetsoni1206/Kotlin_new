package com.car.maintain

class Car(val type:String, val model:Int, val price:Double
               ,val milesDrives:Int, val owner:String ) {
    init {
        println("Object class is created")
    }
}
fun main(){
    val car = Car("BMW",2012,20000.0,120,"Meet Soni")
}