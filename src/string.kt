fun main() {
    var firstname = "John"
    var lastname  = "Njoroge"
    var school = "eMobilis"

    println(firstname)
    println(firstname+" "+lastname) //String concatenation
    println(firstname[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String interpolation
    println("$school is a coding school")

    println("My full name is $firstname $lastname")
}