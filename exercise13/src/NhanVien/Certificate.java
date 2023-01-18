package NhanVien;

public abstract class Certificate {
    String CertificatedID, CertificateName, CertificateRank, CertificatedDate;
    public Certificate(String CertificatedID, String CertificateName, String CertificateRank, String CertificatedDate){
        this.CertificatedDate = CertificatedDate;
        this.CertificateName = CertificateName;
        this.CertificateRank = CertificateRank;
        this.CertificatedID = CertificatedID;
    }
}
