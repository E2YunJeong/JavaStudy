package week3;

public class CirCalc {
    private Cir cir;

    public CirCalc(Cir cir) {
        this.cir = cir;
    }

    public Cir getCir() {
        return cir;
    }

    public void setCir(Cir cir) {
        this.cir = cir;
    }

    public void area() {
        double area = this.cir.getRadius() * this.cir.getRadius() * 3.14;
        System.out.println("원의 반지름 : " + this.cir.getRadius());
        System.out.println("원의 넓이 : " + area);
    }
}
