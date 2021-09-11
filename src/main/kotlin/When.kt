
fun main(){

    val foodID:Int = readLine()!!.toInt()

    when(foodID){

        1 -> {
            print("You got Sandwitch.")
            print("You got salad.")
        }
        10 ->{
            print("You got Burger.")
        }
        else->{
            println("You did not order anything.")
        }
    }
}