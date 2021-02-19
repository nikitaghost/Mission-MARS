import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class Transfer {

    public static BufferedImage imageToImageObject(String imageName) throws IOException {

        File file = new File(imageName);
        BufferedImage image = ImageIO.read(file);
        return image;

    }

    public static double[][] ImageToDoubleArray(Image image){

        double[][] array = new double[image.getWidth()][image.getHeight()];
        Color color = null;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                color = image.getPixelColor(i, j);
                array[i][j] = color.getRGB();
            }
        }

        return array;

    }

}
