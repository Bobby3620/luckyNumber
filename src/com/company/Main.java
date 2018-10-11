package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Where the object is created
        luckyNumber rng = new luckyNumber(9);

        //Where the scanner is created
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = kbInput.nextLine();
        System.out.println("Nice to meet you " + name + "!" + " Your lucky number is " + rng.perfectRandom());

        //Where the user selects 0, 1 or 2
        System.out.println("Please select 0 to exit, 1 for a list of names and random number of the object or 2 to enter another name");
        int num = kbInput.nextInt();

        //Decisions
        if(num == 0){
            System.out.println("exit");
        }
        else if(num == 1){
            System.out.println(name + " " + rng.perfectRandom());
        }
        else if(num == 2){
            System.out.println("Enter another name");
            name = kbInput.nextLine();
            System.out.println(name);
        }

    }
}
