public class Phuc {
    double thuc;
    double ao;
    public Phuc(double thuc, double ao){
        this.thuc = thuc;
        this.ao = ao;
    }

    public double getThuc() {
        return thuc;
    }

    public double getAo() {
        return ao;
    }

    public Phuc add(Phuc x){
        return new Phuc(this.getThuc() + x.getThuc(), this.getAo() + x.getAo());
    }

    public Phuc multiply(Phuc x){
        return new Phuc(this.getThuc()* x.getThuc() - this.getAo()*x.getAo(), this.getThuc()*x.getAo() + this.getAo()* x.getThuc());

    }
    @Override
    public String toString(){
        return getThuc() + " + " + getAo() + "i";
    }
}
