fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("idlal", lambdaUpper))

    println(hello("idlal", { value: String -> value.toLowerCase() }))

    val result1 = hello("idlal", { value: String -> value.toLowerCase() })
    val result2 = hello("idlal") { value: String ->
        value.toLowerCase()
    }
}