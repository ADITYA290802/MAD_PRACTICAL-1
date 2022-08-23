fun main() {
    val a: Int = 122
    val b: Int = 222
    val c: Int = -33
    arithmetic(a,b,c)
}

fun arithmetic(a:Int,b:Int,c:Int) {

    var ans = a + b + c
    println("Addition of $a, $b, $c is $ans")

    ans = a - b - c
    println("Subtraction of $a, $b, $c is $ans")

    ans = a * b * c
    println("Multiplication of $a, $b, $c is $ans")

    ans = b / a
    println("Division of $a, $b is $ans") }
