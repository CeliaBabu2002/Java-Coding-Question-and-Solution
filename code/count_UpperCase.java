package code;

import java.util.Scanner;

public class count_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word:");
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println("number of upper case letter in the word is:" + count);
    }
}
