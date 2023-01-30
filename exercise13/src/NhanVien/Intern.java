package NhanVien;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee{
    String id;

    private String name;
    private String DOB;
    private String phone;
    private String email;
    private String employeeType;

    private List<Certificate> cert;


    private String semester;
    private String school;
    private String major;

    public Intern(String id, String name, String DOB, String phone, String email,  List<Certificate> cert, String semester, String school, String major){
        super(id, name, DOB, phone, email, 2,cert);
        this.semester = semester;
        this.school = school;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String  toString(){
        String out =  "Intern{" +
                "id='" + id + '\'' +
                ", fullName='" + name + '\'' +
                ", birthday=" + DOB +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", majo=" + major + ", school=" + school + "semester" + semester +
                ", proSkill='" + major + '\'' +
                '}';
        return out;
    }

    public void showMe(){
        System.out.println(toString());
    }
}
