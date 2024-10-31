import java.awt.*;
//import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
         to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("Celia ");

        car myCar =new car(25.5,
               "1BC32E",
                Color.BLUE,
                true);
        car sallyCar =new car(13.9,
                "15EDF5",
                Color.BLACK,
                false);
        System.out.println("My Car's License Plate: " +myCar.licensePlate);
        System.out.println("My Car's License Plate: " + sallyCar.licensePlate);
        System.out.println("my car color is"+myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println("my car color is"+myCar.paintColor.toString());
        String userInput="entertaiment";
        String upperInput= userInput.toUpperCase();
        System.out.println(upperInput);
        System.out.println(userInput);


        char indiviualValue = userInput.charAt(0);
        System.out.println(indiviualValue);

        //STRING FUNCTIONS
        System.out.println("contains:"+userInput.contains("enter"));
 input from user using Scanner
        System.out.println("enter the word");
*/


        Scanner sc = new Scanner(System.in);
//
//        String userInput = sc.next();
//        String upperInput= userInput.toUpperCase();
//        System.out.println(upperInput);
//        System.out.println(userInput);
//
//
//        char indiviualValue = userInput.charAt(0);
//        System.out.println(indiviualValue);
//
//        //STRING FUNCTIONS
//        System.out.println("contains:"+userInput.contains("enter"));

        // input only integer or double values

//        int userInput= sc.nextInt();
//        System.out.println(sc);
//
//        double userInputd = sc.nextDouble();
//        System.out.println(sc);

        // Arrays

//       int[] number = new int[5];
//        number[0]=3;
//        number[1]=1;
//        number[2]=4;
//        number[3]=6;
//        number[4]=9;
//        System.out.println(number.toString());
//
//        for(int i=0;i<5;i++){
//            System.out.println(number[i]);
//        }
//
//        String[] candy={"gum","nutella","bounty"};
//        Arrays.sort(candy);
//        System.out.println(Arrays.toString(candy));
//
//        // Array Function
//        Arrays.sort(number);
//        System.out.println(Arrays.toString(number));
//
//        System.out.println(number.length);
//
//        // for this we have to include import java.lang.reflect.Array;
//        System.out.println(Array.get(candy,2));

//        double myCarSpeed = 50;
//        myCarSpeed = myCar.speedingUp(myCarSpeed);
//        System.out.println(myCarSpeed);

        //code with operators

//        System.out.println("enter the age:");
//        Scanner in = new Scanner(System.in);
//        int age=in.nextInt();
//
//        if (age>0 && age<=5){
//            System.out.println("infant");
//        } else if(age>6 && age<=10){
//            System.out.println("Teenage");
//        } else if (age>16 && age<20){
//            System.out.println("adlosence");
//        } else {
//            System.out.println("invalid input");
//        }
//
//        System.out.println("thanks for filling!!!...");
//    }

//-------------------loop

//---------while loop
//        System.out.println("enter the number:");
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int count=0;
//        while(x<10){
//            x++;
//            count+=1;
//        }
//        System.out.println("Final output:"+x);
//        System.out.println("steps:"+count);

//----------Do-while loop
//        System.out.println("enter the number:");
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        do{
//            x=x+1;
//        }while(x<10);
//        System.out.println("Final output:"+x);


//---------For loop
//        System.out.println("enter the number:");
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        for(int i=0;i<=10;i++){
//            x=i+1;
//        }
//        System.out.println("Final output:"+x);

    //-----------Libraries

    //java.lang
    //java.util
    //java.net

//        System.out.println("enter the number:");
//        double power=Math.pow(2,3);
//        double squareroot = Math.sqrt(64);
//        System.out.println("power:"+power+"  squareroot:"+squareroot);
//
//        Random rd=new Random();
//        int rand=rd.nextInt(10);
//        System.out.println(rand);

        Scanner in = new Scanner(Coin());
        coin cd = new coin();
        String intial=flip();
        System.out.println();



    }

