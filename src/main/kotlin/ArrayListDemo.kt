import kotlin.math.max

fun main(){

    println("Pets App")
    val listOfPets= ArrayList<String>()
    do{
        print("Enter Pet name or exit to quit:")
        val petName:String = readLine()!!.toString()
        if (petName != "exit") listOfPets.add(petName)
    }while (petName != "exit")
    println("Your pets Are using Array")
    for (i:Int in 0 until listOfPets.size) println("Pet $i: ${listOfPets[i]}")
    println("Your pets Are using Object")
    for (pet:String in listOfPets) println("Pet : ${pet}")

}