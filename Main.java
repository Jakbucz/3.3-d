import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101) - 50;
            }
        }

        
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}