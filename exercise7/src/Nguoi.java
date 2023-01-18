
public class Nguoi {
    private String id;

    private double luong;
    private double thuong;
    private double phat;
    private double luongThucLinh;
    private String name;
    private int age;
    private String hometown;


    public Nguoi(double luong, double thuong, double phat, double luongThucLinh, String name, int age, String hometown, String id) {
        this.luong = luong;
        this.thuong = thuong;
        this.phat = phat;
        this.luongThucLinh = luongThucLinh;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getPhat() {
        return phat;
    }

    public void setPhat(double phat) {
        this.phat = phat;
    }

    public double getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(double luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }
}