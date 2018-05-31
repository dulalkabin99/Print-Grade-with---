package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int score = scan.nextInt();
        char grade;
        int lastDigit=0;
        char symbol = ' ';

        if (score > 89) {
            grade = 'A';
            lastDigit = (score - 90);
        }
        else if (score > 79 && score <= 89) {
            grade = 'B';
            lastDigit = score - 80;
        }
        else if (score > 69 && score <= 79) {
            grade = 'C';
            lastDigit = score - 70;
        }
        else if (score > 59 && score <= 69) {
            grade = 'D';
            lastDigit = score - 70;
        }
        else{
            grade = 'D';
    }
        if (lastDigit>6)
            symbol = '+';

        else if (lastDigit<3){
            symbol = '-';
        }
        if (score > 59) {
            System.out.println("Very good! You don't have to retake the exam!");
            System.out.println("You are: " + grade + symbol);
        }
        else{
            System.out.println("Did you even look at the book?");
    }
}
}