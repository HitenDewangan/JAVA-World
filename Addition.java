// This was our surprise test problem where we had to print the sum of two user-defined numbers, following the concept of objects and classes...

import java.util.Scanner;

class Calculator
{
    int add(int a, int b){
        return a+b ;
    }

    int sub(int a, int b){
        return Math.abs(a-b);
    }

    int multiply(int a, int b){
        return a*b;
    }
}

class Addition
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st Number:");
        int a = scan.nextInt();

        System.out.println("Enter the 2nd Number:");
        int b = scan.nextInt();

        Calculator c = new Calculator();

        System.out.println("The Sum is: " + c.add(a,b));
        System.out.println("The difference is: " + c.sub(a,b));

    }
}

