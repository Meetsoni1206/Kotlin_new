package com.car.maintain


class ClassConstructor(){
    var type:String? = null
    var model:Int? = null
    var price:Double? = null
    var milesDrives:Int? = null
    var owner:String? = null
    constructor(type:String, model:Int, price:Double, milesDrives:Int, owner:String ):this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrives = milesDrives
        this.owner = owner
    }
    constructor(type:String, model:Int, price:Double, milesDrives:Int ):this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrives = milesDrives
    }
    fun getCarPrice():Double{
        return this.price!! -(this.milesDrives!!.toDouble() *20)
    }
}
fun main(){
    var car1 = ClassConstructor("BMW",2012,20000.0,120,"Meet Soni")
    println(car1.type)
    println(car1.price)
    car1.type = "Audi"
    println(car1.type)
    var currentPrice = car1.getCarPrice()
    println("Current car Price : $currentPrice")
    var car2 = ClassConstructor("Mercedes", 2020, 2300000.0, 0 )
    println(car2.price)
    println(car2.milesDrives)
}