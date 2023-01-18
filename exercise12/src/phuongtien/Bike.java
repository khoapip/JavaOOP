package phuongtien;

public class Bike  extends Vehicle{
    int power;
    public Bike(int id, String brand, int year, String color, int power ){
        super(id, brand, year, color);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
