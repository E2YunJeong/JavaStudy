package week3;

public class Airplane {
    private String modelName;
    private int maxSpeed;
    private int passengersNum;

    // 이륙하기
    void takeOff() {
        System.out.println("take off");
    }

    // 착륙하기
    void landing() {
        System.out.println("landing");
    }

    // 엔진 작동
    void engineStart() {
        System.out.println("engine start");
    }

    // 엔진 끄기
    void engineStop() {
        System.out.println("engine stop");
    }

    // getter
    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPassengersNum() {
        return passengersNum;
    }

    // setter
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMaxSped(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPassengersNum(int passengersNum) {
        this.passengersNum = passengersNum;
    }
}
