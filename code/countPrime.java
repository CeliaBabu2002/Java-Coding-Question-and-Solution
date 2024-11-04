/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
package code;

import java.util.Scanner;

public class countPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        long n = sc.nextLong();
        int count=0;

        while (n > 0) {
            int digit = (int) (n % 10);//to read the last number

            if (OddPrime(digit)) {
                count += 1;
            }
            n = n / 10;//removing the last element

        }
        System.out.println("Number of prime digits in number are "+count);
        
    }

    public static boolean OddPrime(int digit) {
        return digit == 1 || digit == 2 || digit == 3 || digit == 5 || digit == 7;
    }
}
