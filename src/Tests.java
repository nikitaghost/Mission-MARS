import java.awt.*;
import java.io.IOException;

public class Tests {

    public static void main(String[] args) {

        Image originalImage = new Image();
        try {
            originalImage.setBufferedImage(Transfer.imageToImageObject("Elevation Map.jpg"));
            double[][] array = Transfer.ImageToDoubleArray(originalImage);
            IO.exportLines("test.txt", array);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
