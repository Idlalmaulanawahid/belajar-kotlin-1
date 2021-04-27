fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Idlal"

    println(name.hello())

    name.printHello()

    "Maulana".printHello()
}