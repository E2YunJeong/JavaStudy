package week2;

public class Quiz3 {
    public static void main(String[] args) {
        // 2차원 배열 생성과 동시에 초기화
        int[][] seat = {{0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}};

        // 극장에 앉아있는 관객의 수를 세기 위한 변수 선언
        int count = 0;

        // for 문을 사용하여 관객 수 카운트
        // 첫번째 for문 -> 배열의 행 조회
        for (int i = 0; i< seat.length; i++) {
            // 두번째 for문 -> 배열의 열 조회
            // [i] 행의 모든 요소 조회
            for (int j = 0; j<seat[i].length; j++) {
                // 좌석에 관객이 앉아있다면 count 증가
                if (seat[i][j] == 1){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
