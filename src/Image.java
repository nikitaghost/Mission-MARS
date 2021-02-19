import java.awt.*;
import java.awt.image.BufferedImage;

public class Image {

    private BufferedImage bufferedImage;
    private int height;
    private int width;

    public Image(){
        this.bufferedImage = null;
        height = 0;
        width = 0;
    }

    public Image(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
        this.height = bufferedImage.getHeight();
        this.width = bufferedImage.getWidth();
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getPixelColor(int x, int y){
        Object colorData = bufferedImage.getRaster().getDataElements(x, y, null); //данные о пикселе
        int argb = bufferedImage.getColorModel().getRGB(colorData); //преобразование данных в цветовое значение
        return new Color(argb, true);
    }

}
