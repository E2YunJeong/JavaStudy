package week2_extra;

public class Quiz1 {
    public static void main(String[] args) {
        int[] num_array = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i<num_array.length; i++) {

            sum += num_array[i];

            if (i == num_array.length -1) {
                System.out.print(num_array[i]);
                break;
            }
            System.out.print(num_array[i] + " + ");
        }

        System.out.println(" = " + sum);
    }
}
