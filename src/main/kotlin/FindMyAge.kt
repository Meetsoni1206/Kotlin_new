import java.util.*

fun main(){

    print("==Enter Year of Birth==")
    val yearofbirth:Int = readLine()!!.toInt()
    val yearIndevice:Int = Calendar.getInstance().get(Calendar.YEAR)

    val age:Int = yearIndevice - yearofbirth
    println("You are $age years old.")
}