package charAt_Odd_Place;

import java.util.Scanner;

public class charAt_Odd_Place {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String st = in.next();
        int n = st.length();
        
        System.out.println("Characters at odd positions:");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(st.charAt(i)+" ");
            }
        }
    }
}

