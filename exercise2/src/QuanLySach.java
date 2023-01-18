import tailieu.Bao;
import tailieu.Sach;
import tailieu.TaiLieu;
import tailieu.TapChi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySach {
    List<TaiLieu> data;

    public QuanLySach(){
        this.data = new ArrayList<TaiLieu>();
    }

    public void add(TaiLieu t){
        data.add(t);
    }

    public void deleteByID(int code){
        data.removeIf(taiLieu -> taiLieu.getCode() == code);
    }

    public List<TaiLieu> searchType(String type){
        if (type.equals("Tap Chi")){
            return data.stream().filter(x -> x instanceof TapChi).collect(Collectors.toList());
        } else if (type.equals("Bao")) {
            return data.stream().filter(x -> x instanceof Bao).collect(Collectors.toList());
        } else if (type.equals("Sach")) {
            return data.stream().filter(x -> x instanceof Sach).collect(Collectors.toList());
        }
        else{
            System.out.println("We don't have this type of articles");
            return null;
        }
    }

    public void print() {
        this.data.forEach(documents -> System.out.println(documents.toString()));
    }

    public void exit(){
        System.exit(1);
    }
}
