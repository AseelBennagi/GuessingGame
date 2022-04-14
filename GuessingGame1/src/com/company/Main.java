package com.company;


import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Guess the correct number.\nTake a guess between 0 and 100 to try your best to guess the correct number");
	int computerGuess = (int) (Math.random() * 100 + 1);
    int userGuess = 0;
        System.out.println("The correct answer is: " + computerGuess);
        int count = 1;
        while(userGuess != computerGuess){
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            String answer = checkYourAnswer(userGuess, computerGuess, count);
            System.out.print(answer);
            count ++;

        }

    }

    public static String checkYourAnswer(int userGuess, int computerGuess, int count){

        while (userGuess >= 0 && userGuess < 100){
            if( userGuess < computerGuess){
                return "Your guess is less than the correct guess!. Try again\n";
            }else if(userGuess > computerGuess){
                return "Your guess is higher than the correct guess!. Try again\n";
            } else{
                return "Your Guess is Correct. Congrats!!!\nTotal Guesses: " + count;
            }

        }

        return "Your guess is incorrect\nTry Number: " + count + "\n";
    }
}
