fun main(){
    val account = Email("Id01", "123")
    val account2 = Facebook("Id02", "1234")
    val account3 = Google("Id03", "12345")
    test(account)
    test(account2)
    test(account3)
}

fun test(user: User) = when (user){
    is Email -> println("Email: $user")
    is Facebook -> println("Facebook: $user")
    is Google -> println("Google: $user")
}

sealed class User(open val id: String, open val password: String){
    /*fun user() : String{
        return "id: $id, password: $password"
    }*/
}

data class Email(override val id: String, override val password: String) : User(id, password)

data class Facebook(override val id: String, override val password: String) : User(id, password)

data class Google(override val id: String, override val password: String) : User(id, password)

/*Write sealed class for a type User that uses data classes for different types: Email, Facebook, Google.
They need to each have an id, and optionally password or email.
Use them in a when inside a method to return a printable value as String. */

