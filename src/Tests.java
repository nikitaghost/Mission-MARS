import java.io.IOException;

public class Tests {

    public static void main(String[] args) {

        Image originalImage = new Image();
        try {
            originalImage.setBufferedImage(Transfer.imageToImageObject("image.jpg"));
            originalImage.getBufferedImage().getHeight();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(originalImage.getPixelColor(0,0));

    }

}
