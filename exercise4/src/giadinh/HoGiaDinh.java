package giadinh;
import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
    List<GiaDinh> hoGiaDinh;

    public HoGiaDinh() {
        this.hoGiaDinh = new ArrayList<>();
    }

    public List<GiaDinh> getHoGiaDinh() {
        return hoGiaDinh;
    }

    public void setHoGiaDinh(List<GiaDinh> hoGiaDinh) {
        this.hoGiaDinh = hoGiaDinh;
    }

    public void themNha(GiaDinh family) {
        this.hoGiaDinh.add(family);
    }
}
