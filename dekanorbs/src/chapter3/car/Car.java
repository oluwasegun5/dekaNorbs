package chapter3.car;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public String model() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String year() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double price() {
        return price;
    }
}
