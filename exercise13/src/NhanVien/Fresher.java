package NhanVien;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{
    String id;

    private String name;
    private String DOB;
    private String phone;
    private String email;
    private String employeeType;

    private List<Certificate> cert;


    private LocalDate gradDate;
    private String schoolGrad;
    private String classRank;

    public Fresher(String id, String name, String DOB, String phone, String email, String employeeType, List<Certificate> cert, LocalDate gradDate, String schoolGrad, String classRank){
        super(id, name, DOB, phone, email, 0,cert);
        this.gradDate = gradDate;
        this.schoolGrad = schoolGrad;
        this.classRank = classRank;
    }

    public String getClassRank() {
        return classRank;
    }

    public void setClassRank(String classRank) {
        this.classRank = classRank;
    }

    public String getSchoolGrad() {
        return schoolGrad;
    }

    public void setSchoolGrad(String schoolGrad) {
        this.schoolGrad = schoolGrad;
    }

    public LocalDate getGradDate() {
        return gradDate;
    }

    public void setGradDate(LocalDate gradDate) {
        this.gradDate = gradDate;
    }

    @Override
    public void showMe(){
        String out =  "Intern{" +
                "id='" + id + '\'' +
                ", fullName='" + name + '\'' +
                ", birthday=" + DOB +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", majo=" + classRank + ", school=" + schoolGrad + "semester" + gradDate +
                ", proSkill='" + classRank + '\'' +
                '}';
        System.out.println(out);
    }

}
