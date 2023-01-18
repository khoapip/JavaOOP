import canbo.CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
    List<CanBo> data;
    public QLCB(){
        data = new ArrayList<CanBo>();
    }

    public void add(CanBo c){
        data.add(c);
    }

    public List<CanBo> searchName(String name){
        return data.stream().filter(canBo -> canBo.getName().contains(name)).collect(Collectors.toList());
    }

    public void showInfo() {
        this.data.forEach(o -> System.out.println(o.toString()));
    }

    public void exit(){
        System.exit(1);
    }
}
