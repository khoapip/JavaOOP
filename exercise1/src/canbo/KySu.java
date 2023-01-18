package canbo;

public class KySu extends CanBo{
    String field;
    public KySu(String name, int age, String gender, String field){
        super(name, age, gender);
        this.field = field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString(){

        return "Ky Su: " + getName() + " " + getGender() + " " +  getAge() + " " + getField();
    }
}