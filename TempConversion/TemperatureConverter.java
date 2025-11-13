package TempConversion;

public class TemperatureConverter {
    public static double convert(double value, char unit) throws InvalidTemperatureException {
        if (unit == 'C' || unit == 'c') {
            if (value < -273.15) throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
            return (value * 9/5) + 32; // to F
        } else if (unit == 'F' || unit == 'f') {
            if (value < -459.67) throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
            return (value - 32) * 5/9; // to C
        } else {
            throw new InvalidTemperatureException("Unknown unit. Use C or F.");
        }
    }
}
