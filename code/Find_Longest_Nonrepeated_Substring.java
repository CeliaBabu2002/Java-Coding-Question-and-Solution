// Find the first non repeated character substring
//Arijit = Arij
package code;

import java.util.*;

public class Find_Longest_Nonrepeated_Substring {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the word:");
    String str = sc.nextLine();
    int count=0;
    String s="";

        for (int i = 0; i <= str.length(); i++) 
        {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    s = s + str.charAt(i);
                } else {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }
            if (count > 0) {
                break;
            }
        }
        System.out.println(s);
    }
}
