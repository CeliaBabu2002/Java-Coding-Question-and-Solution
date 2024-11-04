package code;

import java.util.*;
public class count_Word_Vowel {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word:");
        String str = sc.nextLine();
        int v = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            }
        }
        System.out.println("number of vowel in the word is:" + v);
    }
    
}
