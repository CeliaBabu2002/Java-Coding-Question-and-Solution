/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 * 
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */
package code;

import java.util.*;

public class Find_CountWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentences");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        System.out.println("enter the word:");
        String word=sc.nextLine();
        String s ="";
        int count=0;

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isLetter(arr[i].charAt(j))) {
                    s = s + arr[i].charAt(j);
                }
            }
            if(s.equals(word)) {
                count++;
            }
            s = "";
        }
        System.out.println("no of "+word+" in sentenceis:"+count);

    }
    
}
