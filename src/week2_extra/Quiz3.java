package week2_extra;

public class Quiz3 {
    public static void main(String[] args) {
        int[][] random_array = new int[3][5];

        System.out.println("< 변경 전 배열 >");
        for (int row = 0; row < random_array.length; row++){
            for (int column = 0; column < random_array[row].length; column++){
                System.out.print(random_array[row][column] + " ");
            }
            System.out.println();
        }

        int count = 0;

        while (count < 5) {
            int row_random = (int) (Math.random() * 3);
            int column_random = (int) (Math.random() * 5);

            if (random_array[row_random][column_random] == 0) {
                random_array[row_random][column_random] = 1;
                count++;
            }
        }

        System.out.println("< 변경 후 배열 >");
        for (int row = 0; row < random_array.length; row++){
            for (int column = 0; column < random_array[row].length; column++){
                System.out.print(random_array[row][column] + " ");
            }
            System.out.println();
        }
    }
}
