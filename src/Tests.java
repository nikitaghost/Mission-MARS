import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Tests {

    public static void main(String[] args) {

        Image originalImage = new Image();
        try {
            originalImage.setBufferedImage(Transfer.imageToImageObject("map.jpg"));
            int[][] array = Transfer.imageToIntArray(originalImage);
            Image image = new Image(Transfer.imageToImageObject("map.jpg"));
            List<Integer> colors = Transfer.Gradation(image, 0, 0);

            IO.exportLines("test.txt", Transfer.compareColors(colors, array));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");

    }

}
