package com.revature.calculator;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        boolean running = true;

        Scanner input = new Scanner(System.in);

        while (running) {

            System.out.printf("Please choose the symbol of your intended operation" + "\n"
                    + "- Addition '+' " + "\n"
                    + "- Subtraction '-' " + "\n"
                    + "- Division '/' " + "\n"
                    + "- Multiplication '*' "
            );

            String choice1 = input.nextLine();

            if(choice1.equals("+")){
                System.out.printf("Please input the first number you want to add: ");

                int num1 = input.nextInt();

                System.out.printf("Please input the second number you want to add: ");

                int num2 = input.nextInt();

                System.out.println("the answer is: " + (num1 + num2));
                break;
            } else if(choice1.equals("-")){
                System.out.printf("Please input the first number: ");

                int num1 = input.nextInt();

                System.out.printf("Please input the second number: ");

                int num2 = input.nextInt();

                System.out.println("the answer is: " + (num1 - num2));
                break;
            }else if(choice1.equals("/")){
                System.out.printf("Please input the first number: ");

                int num1 = input.nextInt();

                System.out.printf("Please input the second number: ");

                int num2 = input.nextInt();

                System.out.println("the answer is: " + (num1 / num2));
                break;
            }else if(choice1.equals("*")){
                System.out.printf("Please input the first number: ");

                int num1 = input.nextInt();

                System.out.printf("Please input the second number: ");

                int num2 = input.nextInt();

                System.out.println("the answer is: " + (num1 * num2));
                break;
            }else{
                System.out.println("Invalid response");
                break;
            }
        }
    }
}
