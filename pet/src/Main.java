import java.awt.*;
import java.lang.Math;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        cat c = new cat();
        dog d = new dog();

        if (c instanceof pet){
            c.play();
        }
        if (d instanceof pet){
            d.play();
        }

        pet p;
        Random rd = new Random();
        int n=rd.nextInt(2);

        if(n==0){
            p = new dog();
        }
        else{
            p = new cat();
        }
        p.play();
    }
}