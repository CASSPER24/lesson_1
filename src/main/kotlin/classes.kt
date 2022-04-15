//Defining a class
class House{
    val color: String = "White"
    val NumberOfWindows: Int = 2
    val IsForSale: Boolean = false

    fun updatecolor(newcolor: String){
        val color = newcolor
    }
}


//class for data
data class Employee(
    val name: String,
    val email: String,
    val company: String,
)

object MyCompany{
    const val name: String = "My Company"
}
class B(x: Int)
class C(val y: Int)
fun main(){
    val employee = Employee("Jane", "jane@mycompany.com",MyCompany.name)
    val bb = B(12)
    val cc = C(42)
    println(employee)
    //println(bb.x) //Unresolved reference
    println(cc.y)
}