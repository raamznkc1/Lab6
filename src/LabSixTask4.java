
/* Scenario 4:
Write a program that creates an integer array of size 30 whose elements are random integers
between 1 and 100. Consider the following definition:
● An index i is a “peak” if arr[i] is strictly greater than its immediate neighbors
arr[i−1] and arr[i+1]; the first and last elements are not considered peaks.
Generate the array and count how many peaks there are. Print their values, the total number
of peaks and the value of the tallest peak. */


import java.util.Random;

public  class LabSixTask4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[30]; // array of size 30

        // fill array with random values between 1â€“100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 101);
        }

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int peakCount = 0; // how many peaks we find
        // check for peaks (bigger than neighbors)
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peakCount++;
            }
        }
        System.out.println("Count of peaks: " + peakCount);

        if (peakCount == 0) {
            System.out.println("No peaks detected.");
            return; // stop program if no peaks
        }

        int[] peakIndexes = new int[peakCount]; // store indices of peaks
        int currentPeakIndex = 0;

        // find and store peak indices
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peakIndexes[currentPeakIndex] = i;
                currentPeakIndex++;
            }
        }

        // print peaks with values
        System.out.println("Indices: ");
        for (int i = 0; i < peakIndexes.length; i++) {
            System.out.println("The peak with the value " + arr[peakIndexes[i]] + " has the index of " + peakIndexes[i]);
        }

        // find tallest peak
        int tallestPeak = arr[peakIndexes[0]];
        for (int i = 0; i < peakIndexes.length; i++) {
            if (arr[peakIndexes[i]] > tallestPeak) {
                tallestPeak = arr[peakIndexes[i]];
            }
        }
        System.out.println("Tallest peak has the height of: " + tallestPeak);
    }
}