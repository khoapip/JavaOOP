package phuongtien;
public class Vehicle {
    private final int id;
    private final  String brand;
    private final int year;
    private String color;
    public Vehicle(int id, String brand, int year, String color ){
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
