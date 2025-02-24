package com.example.rockpaper

import android.icu.lang.UProperty.NameChoice

/* Rules:
   User chooses either of 3 choices-> Rock or Paper or Scissors
   Computer also chooses

   if user wins-> +1 point
   if Computer wins-> -1 point
   if draw -> o point

   winner is the one who has highest points

   Logic for deciding the winner:
   if user has rock and computer has scissors -> user wins
   if user has paper and computer has rock -> user wins
   if user has scissors and computer has paper  -> user wins
    if user has rock  and computer has paper -> Computer wins
    if user has paper and computer has scissor -> computer wins
    if user has scissor and computer has rock -> computer wins

    if user has rock an computer  has rock -> draw
    if user has paper and computer has paper -> draw
    if user has scissor and computer has scissor -> draw

    */

//fun main(){
//while (true){
//     println("Enter your choice: ")
//    println("1. Rock")
//    println("2. Paper")
//    println("3. Scissors")
//    println("4. Exit")
//
//    // userchoice is to take the input from user and store his choice
//    val userChoice = readln().toInt()
//
//    if(userChoice == 4){
//        println("Existing the game...")
//        break
//    }
//    if(userChoice !in 1 .. 3){
//        println("Invalid choice : please enter a number between 1 and 3.")
//        continue
//    }
//
//    val computerChoice = (1 ..3).random()
//
//    println("you chose: ${userChoice}")
//    println("Computer chose : ${computerChoice}")
//
//    val result = getWinner(userChoice, computerChoice)
//  }
//}
//
//fun getWinner(userChoice:Int, computerChoice: Int) : String {
//    if(userChoice == computerChoice){
//        return "Draw"
//    }
//    if((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)){
//        return "User wins"
//
//    }
//    else{
//    return "Computer wins"
//    }
//}

fun main() {
    var userPoints = 0
    var computerPoints = 0

    while(true) {
        println("Enter your choice:")
        println("1. Rock")
        println("2. Paper")
        println("3. Scissor")
        println("4. Exit")

        val userChoice = readln().toInt()
        if (userChoice == 4) {
            println("Exiting the game...")
            println("Final Score - User: $userPoints, Computer: $computerPoints")
            break
        }
        if (userChoice !in 1..3) {
            println("Invalid choice. Please enter a valid choice between 1 to 4.")
            continue
        }

        val computerChoice = (1..3).random()
        println("Computer choice is $computerChoice")

        val result = getWinner(userChoice, computerChoice)
        println(result)

        if (result == "User wins") {
            userPoints++
        } else if (result == "Computer wins") {
            computerPoints++
        }

        println("Score - User: $userPoints, Computer: $computerPoints")
    }
}

fun getWinner(userChoice: Int, computerChoice: Int): String {
    return if (userChoice == computerChoice) {
        "Draw"
    } else if ((userChoice == 1 && computerChoice == 3)
        || (userChoice == 2 && computerChoice == 1)
        || (userChoice == 3 && computerChoice == 2)
    ) {
        "User wins"
    } else {
        "Computer wins"
    }
}