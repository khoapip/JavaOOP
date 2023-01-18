package phuongtien;

public class Car  extends Vehicle{
    int seat;
    String engine;
    public Car(int id, String brand, int year, String color, int seat, String engine ){
        super(id, brand, year, color);
        this.seat = seat;
        this.engine = engine;
    }

    public int getSeat() {
        return seat;
    }

    public String getEngine() {
        return engine;
    }
}
