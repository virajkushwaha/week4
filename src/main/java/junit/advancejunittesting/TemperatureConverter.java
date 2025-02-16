package junit.advancejunittesting;

public class TemperatureConverter {
    // converts celsius to fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    // converts Fahrenheit to celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
