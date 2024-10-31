import java.util.Random;

public class Dice {
//    private int  FaceUp;
//    public Dice() {
//        flip();
//    }
//    public void flip(){
//        Random rd=new Random();
//        FaceUp=rd.nextInt(8);
//    }
//    public  String  getFaceUp(){
//        if (FaceUp==1){
//            return("one");
//        } else if (FaceUp==2) {
//            return ("Two");
//        } else if (FaceUp==3) {
//            return ("Three");
//        } else if (FaceUp==4) {
//            return ("Four");
//        } else if (FaceUp==5) {
//            return ("Five");
//        } else if (FaceUp==6) {
//            return ("Six");
//        } else if (FaceUp==7) {
//            return ("Seven");
//        } else if (FaceUp==8) {
//            return ("Eight");
//        } else {
//            return ("Invalid input");
//        }
//    }

    //------------method2

    Random rand;
    int previous=-1;

    public Dice(){
        this.rand=new Random();

    }
    public int roll(){
        int current = this.rand.nextInt(6)+1;
        this.previous=current;
        return current;
    }
}
