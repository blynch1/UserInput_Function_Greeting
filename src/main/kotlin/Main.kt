fun main(){

    println("What is your name?")
    val userName = readLine()

    println("Thanks for that. What is your age?")
    val userAge = Integer.valueOf(readln())

    //println("user has typed: $userName")

    fun greeting(){
        println("Nice to meet you, $userName")
        println("You are $userAge years old.")

        if (userAge in 1..12) print("You're only a kid.")
        else if (userAge in 13..17) println("teenager")
        else if (userAge in 18..19) println("adult, but still a teen")
        else if (userAge in 20..29) println("adult, but still young")
        else if (userAge in 30..49) println("getting old now")
        else if (userAge in 50..60) println("time to buy that sports car")
        else if (userAge in 61..70) println("time to retire")
        else if (userAge in 71..85) println("get that will ready")
        else if (userAge in 86..99) println("that's a very good age")
        else if (userAge >= 100) println("what's your secret")
        else println("i don't understand")
    }

    greeting()

}