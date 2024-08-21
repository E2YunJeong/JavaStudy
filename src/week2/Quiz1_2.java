package week2;

public class Quiz1_2 {
    public static void main(String[] args) {

        // 자료형이 int, 크기가 10인 배열 num_array 생성
        int[] num_array = new int[10];

        // for 문을 사용하여 배열 초기화
        for (int i = 0; i<10; i++){
            num_array[i] = i;
        }

        // for-each 문을 사용하여 배열 값 출력
        for (int num : num_array) {
            System.out.println(num);
        }
    }
}
