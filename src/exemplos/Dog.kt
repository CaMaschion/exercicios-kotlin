package exemplos

//How to create a Dog class
class Dog(val name: String, var weight: Int, val breed: String) {

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof")
    }

//    How to create a Dog object
//    var myDog  = Dog("Tibor", 14, "Mixed")

//    How to access a Dog object, using the operator (.)
//    println(myDog.name)

//    How to update a property
//    myDog.weight = 75

//    How to call object's function
//    myDog.bark()

//    What if the Dog is in a Dog array?

    var dogs = arrayOf(
        Dog(
            "Tibor",
            14,
            "Mixed"
        ),
        Dog(
            "Agnes",
            50,
            "Amstaff"
        ),
        Dog(
            "Cleonice",
            8,
            "Spitz"
        )
    )

}