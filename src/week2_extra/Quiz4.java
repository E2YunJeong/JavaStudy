package week2_extra;

public class Quiz4 {
    public static void main(String[] args) {
        Car Car1 = new Car();
        Car Car2 = new Car();

        Car1.color = "검정";
        Car1.speed = 80;

        Car2.color = "빨강";
        Car2.speed = 40;

        Car1.print();
        Car2.print();
    }
}
