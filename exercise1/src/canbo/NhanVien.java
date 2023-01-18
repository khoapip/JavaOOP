package canbo;

public class NhanVien extends CanBo{
    String job;
    public NhanVien(String name, int age, String gender, String job){
        super(name, age, gender);
        this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }


    @Override
    public String toString(){

        return "Nhan Vien: " + getName() + " " + getGender() + " " +  getAge() + " " + getJob();
    }
}