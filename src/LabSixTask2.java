import java.util.Random;

public  class LabSixTask2 {
    // Function to rotate an array to the right by one position
    public static int[] rotateRight(int[] arr) {
        int n = arr.length;
        int[] rotated = new int[n];

        // Last element moves to the first position
        rotated[0] = arr[n - 1];

        // Shift others one position to the right
        for (int i = 1; i < n; i++) {
            rotated[i] = arr[i - 1];
        }

        return rotated; // return new rotated array
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int arraySize = rnd.nextInt(10, 21); // pick random size between 10 and 20
        int[] arr = new int[arraySize];

        // fill with random values (0â€“99)
        for (int i = 0; i < arraySize; i++) {
            arr[i] = rnd.nextInt(100);
        }

        // print original array
        System.out.print("Original: ");
        for (int i = 0; i < arraySize; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println();

        // rotate using the function
        int[] rotatedArr = rotateRight(arr);

        // print rotated array
        System.out.print("Rotated:  ");
        for (int i = 0; i < rotatedArr.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(rotatedArr[i]);
        }
    }
}