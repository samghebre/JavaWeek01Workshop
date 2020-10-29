package com.codedifferently.part02;
import java.util.Scanner;
public class TooHighTooLow {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int mystryNum = 5;
        System.out.println("Gues a number between 1 and 10");
        int guesNum = input.nextInt();
        while (guesNum != mystryNum) {
            if (guesNum > mystryNum) {
                System.out.println("Number is too high"); 
                counter += 1;   
                System.out.println("Gues a number between 1 and 10");
                guesNum = input.nextInt(); 
            }
            else if (guesNum < mystryNum) {
                System.out.println("Number is too low");
                counter += 1;   
                System.out.println("Gues a number between 1 and 10");
                guesNum = input.nextInt(); 
            }
             
            
        }
        counter +=1;
        System.out.println("you hit the target number!  " + counter);
    }
}