package code;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        System.out.print("fibnoacci series: " + t1 +" "+t2+" ");
        for (int i = 1; i <= n; i++) {
            int t3 = t1 + t2;
            System.out.print(t3+" ");
            t1 = t2;
            t2 = t3;
        }
    }
}
