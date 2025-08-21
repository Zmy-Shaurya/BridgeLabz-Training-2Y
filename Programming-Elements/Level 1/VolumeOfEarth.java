public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius_km = 6378; //km
        double radius_miles = 6378 * 0.621371;
        double volume_km3 = (4.0 / 3.0) * Math.PI * Math.pow(radius_km, 3);
        double volume_miles3 = (4.0 / 3.0) * Math.PI * Math.pow(radius_miles, 3);
        System.out.println("Volume of Earth in cubic kilometers is " + volume_km3 + "and cubic miles is "+ volume_miles3);

    }
}
