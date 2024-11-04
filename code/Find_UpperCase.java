/*Given a sentence, Find words that start with a capital letter.

For example, in the sentence "The quick Brown Fox jumps over the lazy dog", there are three words that start with a 
capital letter: "The", "Brown", and "Fox". */
package code;

import java.util.Scanner;

public class Find_UpperCase {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z') 
            {
                System.out.print(arr[i]+"\t");
            }
        }
    }
    
}
