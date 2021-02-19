import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Transfer {

    public static BufferedImage imageToImageObject(String imageName) throws IOException {

        File file = new File(imageName);
        BufferedImage image = ImageIO.read(file);
        return image;

    }

}
