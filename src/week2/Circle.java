package week2;

public class Circle {
    // 필드 (멤버 변수)
    int radius;

    // 메소드 (멤버 함수)
    public double area(){
        // this를 사용하는 이유 : 클래스의 필드(멤버 변수)를 명확하게 구분하기 위해서
        // 이번 예제는 간단한 문제이므로 this를 사용하지 않아도 되지만,
        // 코드가 복잡하거나 필드와 매개변수를 명확하게 구분하기 위해선 사용하는 것이 좋음
        // this를 습관화하자!
        return (this.radius * this.radius * 3.14);
    }
}
