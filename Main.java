import java.util.Scanner;
public class Main {
Scanner sc = new Scanner(System.in);

public void checkPalindrome() {

    System.out.println("================================================");

    int r, sum = 0, temp;
    System.out.print("Enter a number to check if it is a palindrome: ");
    int num = sc.nextInt();
    System.out.println();
    temp = num;
    while (num > 0) {
    r = num % 10;
     
    sum = (sum * 10) + r;
    num = num / 10;
}
    if (temp == sum){
        System.out.println(temp + " is a palindrome number");
    }
    else{
        System.out.println(temp + " is not palindrome number");
    }
    System.out.println("================================================");

}

public void printPattern() {

    System.out.println("================================================");


    
    System.out.println("Enter a number to print the pattern :--");
    int num = sc.nextInt();
    if (num > 0) {
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    } 
    else
        System.out.println("enter valid number ");

    System.out.println("================================================");


}

public void checkPrimeNumber() {

    System.out.println("================================================");


    System.out.print("Enter a number to check Prime Number : ");
    int value = sc.nextInt();
    boolean prime = true;
    for (int i = 2; i <= value / 2; ++i) {
    
        if (value % i == 0) {
            prime = false;
            break;
        }
    }
    if (prime)
        System.out.println(value + " is a prime number.");
    else
        System.out.println(value + " is not a prime number.");
    System.out.println();

    System.out.println("================================================");


}
// function to print Fibonacci Series
public void printFibonacciSeries() { 
    System.out.println("================================================");

    System.out.println("Enter a number to print the Fibonacci series of the number.\n");
    int value = sc.nextInt();
    int first = 0, second = 1, sum = 0;
    if (value == 0) {
        System.out.println("The fibonacci series is: "+ first);
    } 
    else if (value == 1) {
        System.out.println("The fibonacci series is: "+ first + ", " + second);
    } 
    else {
        System.out.print("The fibonacci series is: " +first + ", " + second);
        while (value > 1) {
            sum = first + second;
            System.out.print(", " + sum);
            first = second;
            second = sum;
            value -= 1;
        }
    }
    System.out.println();
    System.out.println("================================================");

}

public static void main(String[] args) {
    Main obj = new Main();
    int choice;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("----Enter your choice from below list------.\n" + "1. Find palindrome of number.\n"
            + "2. Print Pattern for a given number.\n"+ "3. Check whetherthe no is a  prime number or not.\n"
            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n"+"----------------------------------------");
        System.out.println();
        choice = sc.nextInt();
        switch (choice) {
        case 0:
            choice = 0;
            break;
        case 1: {
            obj.checkPalindrome();
        }
        break;
        case 2: {
            obj.printPattern();
        }
        break;
        case 3: {
            obj.checkPrimeNumber();
        }
        break;
        case 4: {
            obj.printFibonacciSeries();
        }
        break;
        default:
            System.out.println("Invalid choice. Enter a valid no.\n");}
    } 
    while (choice != 0);
    System.out.println("Exited Successfully!!!");
    sc.close();
    }


}
