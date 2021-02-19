import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class Transfer {

    public static BufferedImage imageToImageObject(String imageName) throws IOException {

        File file = new File(imageName);
        BufferedImage image = ImageIO.read(file);
        return image;

    }

    public static int[][] imageToIntArray(Image image){

        int[][] array = new int[image.getWidth()][image.getHeight()];
        Color color = null;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                color = image.getPixelColor(i, j);
                array[i][j] = color.getRGB();
            }
        }

        return array;

    }

    public static List<Integer> Gradation(Image image, int min, int max){

        int[][] arr = imageToIntArray(image);
        List<Integer> colors = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                colors.add(arr[i][j]);
            }
        }

        return colors;

    }

    public static double[][] compareColors(List<Integer> colors, int[][] data){

        double[][] array = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length; j++){
                for (int color : colors){
                    if (data[i][j] == color){
                        array[i][j] = 1.0;
                    } else{
                        array[i][j] = 0.0;
                    }
                }
            }
        }

        return array;

    }

    public static String[][] imageToStringArray(Image image){

        String[][] array = new String[image.getWidth()][image.getHeight()];
        Color color = null;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                color = image.getPixelColor(i, j);
                String temp = String.format("%d %d %d", color.getRed(), color.getGreen(), color.getBlue());
                array[i][j] = temp;
            }
        }

        return array;

    }

    /*
    public static List<String> Gradation(Image image, int min, int max){

        String[][] arr = imageToStringArray(image);
        List<String> colors = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                colors.add(arr[i][j]);
            }
        }

        return colors;

    }

    public static double[][] compareColors(List<String> colors, String[][] data){

        double[][] array = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length; j++){
                for (String color : colors){
                    if (data[i][j].equals(color)){
                        array[i][j] = 1.0;
                    } else{
                        array[i][j] = 0.0;
                    }
                }
            }
        }

        return array;

    }

     */
}
