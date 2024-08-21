package week3;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();

        airplane.setModelName("ASIANA");
        airplane.setMaxSped(800);
        airplane.setPassengersNum(300);

        System.out.println("비행기 모델 : " + airplane.getModelName());
        System.out.println("비행기 최고 속도 : " + airplane.getMaxSpeed());
        System.out.println("비행기 탑승 인원 : " + airplane.getPassengersNum());
    }
}
