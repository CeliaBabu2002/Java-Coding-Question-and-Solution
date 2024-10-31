import java.awt.*;
public class car {
    // data \ types:
    //int ->interger 1,2,3
    //double -> decimal 3.4,5.1
    //String ->"hello world"
    //Color -> from awt library
    // boolean -> true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    public car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTaillightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTaillightsWorking;


    }
    public void  changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed +=100;
        return currentSpeed;
    }
}
