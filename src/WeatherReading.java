import java.util.Date;

public class WeatherReading {

//    private instance variables:

    private double latitude;
    private double longitude;
    private Date recordedAt;
    private double tempInCelsius;

//    public static method:
//
//    kelvinToCelsius - takes in a double and returns a double, converting temp from Kelvin to Celsius

    public static double kelvinToCelcius(double kelvin) {
        return kelvin - 273.15;
    }
//
//    public instance methods:

    public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInKelvin) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.recordedAt = recordedAt;
        this.tempInCelsius = kelvinToCelcius(tempInKelvin);
    }

//
//    getters and setters
//
//    for the setter for tempInCelsius, pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(Date recordedAt) {
        this.recordedAt = recordedAt;
    }

    public double getTempInCelsius() {
        return tempInCelsius;
    }

    public void setTempInCelsius(double tempInKelvin) {
        this.tempInCelsius = kelvinToCelcius(tempInKelvin);
    }


    //    add a constructor that sets all fields
//
//    when setting the tempInCelsius pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
//
//    Add the following main method to test it out:
//
    public static void main(String[] args) {
//
        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.println(wr.getTempInCelsius());

    }
}