
fun main(){
    val message = "Welcome to new york"
    val name = "Meet"
    val alMessage = message + "," + name
    val tokens:List<String> = message.split(" ")
    for (token in tokens){
        println("token:$token")
    }
    println(alMessage)
}