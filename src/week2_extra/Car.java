package week2_extra;

public class Car {
    String color;
    int speed;

    public int ChangeSpeed() {
        if (this.speed >= 50) {
            this.speed -= 10;
        }
        else {
            this.speed += 10;
        }

        return this.speed;
    }

    public void print(){
        System.out.println("Car1의 색 : " + this.color);
        System.out.println("Car1의 속도 : " + this.speed);
        System.out.println("Car1의 속도변경 : " + this.ChangeSpeed());
    }
}
