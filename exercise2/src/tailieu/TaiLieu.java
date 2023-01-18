package tailieu;

public class TaiLieu {

    private final int code;
    private String nxb;
    private int copies;

    public TaiLieu(int code, String nxb, int copies){
        this.code = code;
        this.nxb = nxb;
        this.copies = copies;
    }

    public int getCode() {
        return code;
    }

    public String getNxb() {
        return nxb;
    }

    public int getCopies() {
        return copies;
    }

    @Override
    public String toString() {
        return "Tai Lieu: code "+ getCode() + " nxb " + getNxb() + " copies " + getCopies();
    }
}
