package CharRepeat;

import java.util.Scanner;

public class CharRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the word:");
        String st = sc.next();
        
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0); // Read the first character of the input
        
        int count = 0;
        int l = st.length();
        
        for (int i = 0; i < l; i++) { // Change to i < l to avoid out-of-bounds error
            if (st.charAt(i) == ch) {
                count++;
            }
        }
        
        System.out.println("The number of times the character appears in the word = " + count);
    }
}

