



fun main() {
    println("Hello Kotlin")

    // variables:
    val name: String = "Daniel" // vals are assign only variables. we can't update them
    var changeableName: String = "Daniel" // vars are changable.
    changeableName = "Marko"

    println(id)

    // there are optionals in kotlin as well
    var lastName: String? = "Cohen"

    // Kotlin supports type inference
    var idPerson2 = 294185 // with autocomplete we can see it's an Int.


    // Control flow:
    if (lastName != null) {
        println(lastName)
    } else {
        println("last name is null")
    }

    // when statement is similar to switch case
    when(lastName) {
        null -> println("Hi")
        else -> println(lastName)
    }

    // we can use if expression to assign value to variable
    val greetingToPrint = if(lastName != null) ("Hi Im" + lastName) else "Hi"
    // another approach:
    val greetingToPrint2 = when (lastName) {
        null -> "Hi"
        else -> "Hi I am" + lastName
    }



}

// We can decalre variables outside enclosing function or class.
val id: Int = 285493710 // they can be used just as any variables



