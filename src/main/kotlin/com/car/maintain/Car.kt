package com.car.maintain

class Car(
    var type:String, val model:Int, val price:Double
    , val milesDrives:Int, val owner:String ) {
    init {
        println("Object class is created")
    }
    fun getCarPrice():Double{
            return this.price - (this.milesDrives.toDouble() *20)
    }
}
fun main(){
    var car = Car("BMW",2012,20000.0,120,"Meet Soni")
    println(car.type)
    println(car.price)
    car.type = "Audi"
    println(car.type)
    var currentPrice = car.getCarPrice()
    println("Current car Price : $currentPrice")
}

