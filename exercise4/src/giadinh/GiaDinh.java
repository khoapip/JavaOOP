package giadinh;

import java.util.List;

public class GiaDinh {
    private List<Nguoi> nha;
    private String address;

    public GiaDinh(List<Nguoi> nha, String address) {
        this.nha = nha;
        this.address = address;
    }

    public List<Nguoi> getNha() {
        return nha;
    }

    public void setNha(List<Nguoi> nha) {
        this.nha = nha;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nha " + getNha() + " dia chi " + getAddress();
    }
}