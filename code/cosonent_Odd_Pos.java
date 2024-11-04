/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */
package code;

import java.util.Scanner;
public class cosonent_Odd_Pos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();

        StringBuilder result=new StringBuilder();

        for(int i=1;i<str.length();i+=2){
            char ch=str.charAt(i);

            if (isCosonent(ch)){
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }

    public static boolean isCosonent(char ch) {
        ch=Character.toLowerCase(ch);
        return "bcdfghjklmnpqrstvwxyz".indexOf(ch) != -1;
    }
}