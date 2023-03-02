package web.Model;


public class Car {

    private String carBrand;

    private String colour;

    private String transmission;


    public Car(String engine, String colour, String transmission) {
        this.carBrand = engine;
        this.colour = colour;
        this.transmission = transmission;
    }

    public Car() {
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + carBrand + '\'' +
                ", colour='" + colour + '\'' +
                ", Transmission='" + transmission + '\'' +
                '}';
    }
}


