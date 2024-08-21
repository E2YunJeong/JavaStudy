package week2_extra;

public class Quiz2 {
    public static void main(String[] args) {
        int[][] student = {
                {85, 78, 62, 93, 72},
                {45, 80, 86, 73, 68},
                {75, 97, 90, 77, 82}
        };

        // 학생별 평균 점수 출력
        for (int row = 0; row < student.length; row++){
            int student_average = 0;
            for (int column = 0; column<student[row].length; column++){
                student_average += student[row][column];
            }

            System.out.println("학생 " + (row+1) +"의 평균 점수 : " + (student_average/student[row].length));
        }

        // 각 테스트별 평균 점수 출력
        for (int column = 0; column < student[0].length; column++){
            int test_average = 0;
            for (int row = 0; row<student.length; row++){
                test_average += student[row][column];
            }

            System.out.println("테스트 " + (column + 1) + "의 평균 점수 : " + (test_average/ student.length));
        }
    }
}
