/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class PrimeChecker {

   
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int i = num; 
        while (i >=num) {
            if (num % i == 0) {
                return false;
            }
            i--;
        }
        return true;
    }


    public static void printPrimes(int max) {
        int number = 2;
        while (number < max) {
            if (checkPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    public static void main(String[] args) {
         
    }
}
