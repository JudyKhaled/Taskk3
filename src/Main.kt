import java.util.Scanner
fun main(){
    var scanner=Scanner(System.`in`)
    println("Please enter the car Model,Color,Speed for BMW")
    val input= BMW(scanner.next(),scanner.next(),scanner.nextInt())
    scanner.nextLine()
    println("The fuel Type for BMW is ${input.getFuelType()}")
    val input2 = Tesla(scanner.next(),scanner.next(),scanner.nextInt())
    scanner.nextLine()
    println("The fuel Type for Tesla is ${input2.getFuelType()}")
}