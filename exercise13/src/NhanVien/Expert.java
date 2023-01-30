package NhanVien;

import java.time.LocalDate;
import java.util.List;

public class Expert extends Employee{
    String id;

    private String name;
    private String DOB;
    private String phone;
    private String email;
    private String employeeType;

    private List<Certificate> cert;

    private int expYear;

    private String proSkill;

    public Expert(String id, String name, String DOB, String phone, String email,  List<Certificate> cert, int expYear, String proSkill){
        super(id, name, DOB, phone, email, 0,cert);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    @Override
    public void showMe(){
        System.out.println(toString());
    }
    @Override
    public String toString(){
        String out =  "Experience{" +
                "id='" + id + '\'' +
                ", fullName='" + name + '\'' +
                ", birthday=" + DOB +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", yearOfExperience=" + expYear +
                ", proSkill='" + proSkill + '\'' +
                '}';

        return out;
    }
}
