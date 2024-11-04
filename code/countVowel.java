/* Count number of vowel, consonent and digit into a string */
package code;

import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word:");
        String str=sc.nextLine();
        int v=0;
        int c=0;
        int n=0;

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                        || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
            if (Character.isDigit(ch)) {
                n++;
            }

        }
        System.out.println("number of vowels are: " + v);
        System.out.println("number of cosonent are: " + c);
        System.out.println("number of digits are: "+n);
    }
}
