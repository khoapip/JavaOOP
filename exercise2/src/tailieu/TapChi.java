package tailieu;

public class TapChi extends  TaiLieu {
    private final String month;
    private final int episode;
    public TapChi(int code, String nxb, int copies, String month, int episode){
        super(code, nxb, copies);
        this.month = month;
        this.episode = episode;
    }

    public String getMonth() {
        return month;
    }

    public int getEpisode() {
        return episode;
    }

    @Override
    public String toString() {
        return "TapChi: code "+ getCode() + " nxb " + getNxb() + " copies " + getCopies() + " episodes " + getEpisode() + " month " + getMonth();
    }
}
