package tailieu;

public class Bao extends  TaiLieu {
    private final int day;
    public Bao(int code, String nxb, int copies, int day){
        super(code, nxb, copies);
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Sach: code "+ getCode() + " nxb " + getNxb() + " copies " + getCopies() + " day " + getDay();
    }
}
