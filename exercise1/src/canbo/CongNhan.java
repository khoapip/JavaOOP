package canbo;

public class CongNhan extends CanBo{
    int level;
    public CongNhan(String name, int age, String gender, int level){
        super(name, age, gender);
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString(){

        return "Cong Nhan: " + getName() + " " + getGender() + " " +  getAge() + " " + getLevel();
    }
}