fun main() {

    var firstName: String = "idlal"
    var lastName: String = "Maulana"

    var address: String = """
        >Perum Mangkalaya H4 No.8,
        >Kabupaten Sukabumi,
        >Jawa barat,
        >Indonesias
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}