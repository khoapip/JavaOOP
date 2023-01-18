package phuongtien;

public class Truck  extends Vehicle{
    int weight;
    public Truck(int id, String brand, int year, String color, int weight ){
        super(id, brand, year, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
