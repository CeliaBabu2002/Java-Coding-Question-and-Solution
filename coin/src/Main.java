import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        coin cd = new coin();
        System.out.println("initial:"+cd.getFaceUp());
        for(int i=0;i<10;i++){
            cd.flip();
            System.out.println("AfterFlip:" + cd.getFaceUp());
        }
    }

}