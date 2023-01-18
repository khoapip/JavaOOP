package tailieu;

public class Sach extends  TaiLieu {
    private final String author;
    private  final int page;
    public Sach(int code, String nxb, int copies, String author, int page){
        super(code, nxb, copies);
        this.author = author;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "Sach: code "+ getCode() + " nxb " + getNxb() + " copies " + getCopies() + " authors " + getAuthor() + " page " + getPage();
    }
}
