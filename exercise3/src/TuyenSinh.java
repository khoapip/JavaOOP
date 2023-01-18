import thisinh.ThiSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
    List<ThiSinh> data;
    public TuyenSinh(){
        data = new ArrayList<ThiSinh>();
    }

    public void add(ThiSinh t){
        if (!data.stream().anyMatch(thiSinh -> thiSinh.getId() == t.getId())){
            data.add(t);
        }
    }

    public void print(){
        data.forEach(t -> System.out.print(t.toString()));
    }

    public List<ThiSinh> filterById(int id){
        return data.stream().filter(thiSinh -> thiSinh.getId() == id).collect(Collectors.toList());
    }

    public void exit(){
        System.exit(1);
    }
}
