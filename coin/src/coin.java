import java.util.Random;

public class coin {
        public final static int Head = 0;
        public final static int Tail = 1;

        private int FaceUp;

        public coin() {
            flip();
        }

        public void flip() {
            Random rd = new Random();
            FaceUp = rd.nextInt(2);
        }

        public String getFaceUp() {
            if (FaceUp == Head) {
                return ("Head");
            } else if (FaceUp == Tail) {
                return ("Tail");
            } else {
                return ("invalid input");
            }
        }
}
