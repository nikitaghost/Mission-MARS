import java.io.*;

public class IO {

    public static boolean exportLines(String file, double[][] array){

        PrintWriter output = null;
        if (array == null){
            return false;
        }
        try {
            output = new PrintWriter(new FileWriter(file));
            for (int i = 20; i < array.length; i++){
                for (int j = 20; j < array[0].length; j++){
                    output.print(array[i][j] + ",");
                }
                output.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (output != null){
                output.close();
            }
            return true;
        }

    }

}
