package NhanVien;
import java.time.LocalDate; // import the LocalDate class
import java.util.List;

public abstract class Employee {
    private String id;
    private String name;
    private String DOB;
    private String phone;
    private String email;
    private int employeeType;
    public static int employeeCount;

    private List<Certificate> cert;

    public Employee(String id, String name, String DOB, String phone, String email, int employeeType, List<Certificate> cert){
        this.name = name;
        this.DOB = DOB;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.cert = cert;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getEmail() {
        return email;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCert(List<Certificate> cert) {
        this.cert = cert;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addCert(Certificate certificate){
        cert.add(certificate);
    }

    public void showMe() {
        String out= "Experience{" +
                "id='" + id + '\'' +
                ", fullName='" + name + '\'' +
                ", birthday=" + DOB +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';

        System.out.println(out);
    }
}
