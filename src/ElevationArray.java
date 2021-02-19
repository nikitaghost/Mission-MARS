public class ElevationArray {

    private double[][] elevation;

    public ElevationArray(){
        this.elevation = new double[0][0];
    }

    public ElevationArray(double[][] elevation) {
        this.elevation = elevation;
    }

    public double[][] getElevation() {
        return elevation;
    }

    public void exportElevationOnArray(){

    }

    public void setElevation(double[][] elevation) {
        this.elevation = elevation;
    }

}
