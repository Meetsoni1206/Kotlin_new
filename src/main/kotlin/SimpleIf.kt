
fun main(){

    print("Enter your grade: ")
    val grade:Int = readLine()!!.toInt()

    if (grade>= 90){
        println("A")
    }
    if (grade< 70){
        println("Fail")
    }
println("End of App")
}