package code;

import java.util.Scanner;

public class count_Word {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the sentence:");
        // String str = sc.nextLine();
        // int count = 1;
        // for (int i = 0; i < str.length(); i++)
        //  {
        //     if (str.charAt(i) == ' ') 
        //     {
        //         count++;
        //    }
        // }
        // System.out.println("number of words in the sentence is: "+count);



        ///------------Another method

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != " ") {
                count++;
                result.append(arr[i]+"\n");
            }
        }
        System.out.println("number of words in the sentence is: "+count);
        System.out.print("words:"+result);
    }
}
