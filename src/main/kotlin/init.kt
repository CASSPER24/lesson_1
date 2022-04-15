
class Square(val side: Int){
    init{ // init constructor
        println(side*2)
    }
}

class Circle(val radius:Double ){
    constructor(name: String): this(1.0)
    constructor(diameter: Int) : this(diameter/ 2.0){
        println("in diameter")
    }
    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}
fun main(){
    val s = Square(10)
    val c = Circle(3)
}