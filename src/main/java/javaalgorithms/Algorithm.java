package javaalgorithms;

import java.util.*;

public class Algorithm {

    public int calculateSum()
    {   int sum = 0;
        for (int i = 1; i <= 100; i++)
            sum += i;

        return sum;
    }

    public int smallestNumber(int[] numberArray)
    {
        int min = numberArray[0];

        for (int i = 1; i < numberArray.length; i++)
            if (numberArray[i] < min)
                min = numberArray[i];

        return min;
    }

    public int maxDigit(int n)
    {
        int digit, max = 0;
        while (n!=0) {
            digit = n % 10;
            if (digit > max)
                max = digit;
            n = n / 10;
        }
        return max;
    }

    public boolean isPalindrom(int n)
    {
        int digit, rev = 0, nb = n;
        while (nb!=0)
        {
            digit = nb%10;
            rev = rev * 10 + digit;
            nb = nb/10;
        }

        if (n == rev)
            return true;

        return false;
    }

    public boolean isPrime(int n)
    {
        if (n<=1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i ==0)
                return false;

        return true;
    }

    public void printPrimeNumbers(int n)
    {
        for (int i = 0; i < n; i++)
            if (isPrime(i))
                System.out.print(i + " ");
    }

}
