fun main() {
    val x = 10
    val y = 28
    val sum = x + y
    print("Sum = $sum")
    println("\nDouble = ${double(10)}")
    print("Whats your name: ")
    var my_name = readLine()
    println("$my_name is also your name")
    printname("Derrick")
}
fun double(x: Int): Int{
    if(x % 2 ==1){
        return 2*x }
    return 4*x
}
fun printname(name: String){
    println(message = "\nMy name is $name")
}
