fun main() {

    val names: Array<String> = arrayOf("idlal", "fahmi", "ari")
    // names.set(0, "Rudi")
    names[0] = "ade"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "idlal"
    members[1] = "idlal"
    members[2] = "idlal"
    members[3] = null
    members[4] = "idlal"
    println(members.size)

}