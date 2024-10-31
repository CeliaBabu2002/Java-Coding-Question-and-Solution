package calculator;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the operation:");
        String st = in.next();
        System.out.println("enter the numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c;
        switch (st) {
            case "add": c=a+b;
                System.out.println(c);
                break;
            case "subtract": c=a-b;
                System.out.println(c);
                break;
            case "multiply": c=a*b;
                System.out.println(c);
                break;
            case "divide": c=a/b;
                System.out.println(c);
                break;
            default:System.out.println("invalid input");
            }
    }
    
}
