import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String args[]){
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array: " + Arrays.toString(array));

        shuffleArray(array);

        System.out.println("Shuffled Array: " + Arrays.toString(array));

    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randomIndex = random.nextInt(i + 1);

            // Swap array elements at i and randomIndex
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
}
}
