fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("idlal", "Maulana", "Wahid")
    fullName(
        lastName = "wahid",
        firstName = "idlal",
        middleName = "Maulana"
    )
}