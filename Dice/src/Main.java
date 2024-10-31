//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Dice d=new Dice();
//        System.out.println("initial:"+d.getFaceUp());
//        for(int i=0;i<10;i++){
//            d.flip();
//            System.out.println("After flip:"+d.getFaceUp());
//        }
        //-----------method 2
        Dice d=new Dice();
        System.out.println("previous value"+d.previous);
        System.out.println(d.roll());
        System.out.println("previous value:"+d.previous);
        System.out.println(d.roll());
    }
}