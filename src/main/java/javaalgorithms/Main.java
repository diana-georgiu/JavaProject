package javaalgorithms;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Algorithm alg = new Algorithm();

        String ans = readMenuOption(scan);

        switch(ans) {
            case "1":
                System.out.println("The sum of the first 100 numbers higher than 0 is: " + alg.calculateSum());
                break;

            case "2":
                int[] myArray = readArrayNumbers(scan);
                System.out.println("The smallest number in the array is: " + alg.smallestNumber(myArray));
                break;

            case "3":
                int nb1 = readNumber(scan);
                System.out.println("The maximimum digit of the number " + nb1 + " is: " + alg.maxDigit(nb1));
                break;

            case "4":
                int nb2 = readNumber(scan);
                if (alg.isPalindrom((nb2)))
                    System.out.println("The number " + nb2 + " is palindrom.");
                else
                    System.out.println("The number " + nb2 + " is not palindrom.");
                break;

            case "5":
              int nb3 = readNumber(scan);
              System.out.println("The prime numbers lower than " + nb3 + " are : ");
              alg.printPrimeNumbers(nb3);
              break;
        }
    }

    private static String readMenuOption(Scanner s)
    {
        System.out.println("Please select an option from the following menu: ");
        System.out.println("1: Calculate the sum of the first 100 numbers higher than 0 ");
        System.out.println("2: Display the smallest number from an array of numbers ");
        System.out.println("3: Display the max digit from a number ");
        System.out.println("4: Check if a number is palindrom ");
        System.out.println("5: Display all the prime numbers lower than a given number ");

        System.out.println("Your options is: ");
        return s.next();
    }


    private static int readNumber(Scanner s)
    {
        System.out.println("Enter the number: ");
        return Integer.parseInt(s.next());
    }

    private static int[] readArrayNumbers(Scanner s)
    {
        System.out.println("Enter the number of elements: ");
        int n = Integer.parseInt(s.next());

        System.out.println("Enter the elements of the array delimited by space: ");
        Scanner s2 = new Scanner(s.next());
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++)
            myArray[i] = s2.nextInt();

        return myArray;
    }
}
