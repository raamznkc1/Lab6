/*Scenario 1:
SE115’s current roster is stored in the school system as an integer array of length 20, where
each entry is a student ID. After the enrollment process, you learn that the class size will
        increase. Write a program that defines a method which takes the old roster array and the
desired new roster size as parameters. The method should return a new integer array of the
given size. The first positions of the new array must contain the original IDs in the same
order, and the remaining positions should be left empty (default values).
        In main, create a sample old roster with student IDs starting at 1000 and increasing by 1.
Call the method with a larger new size (for example, 42), and print both the old and new
arrays to verify that the copying worked correctly.
*/

public class LabSixTask1 {

     static int[] expandRoster(int[] oldRoster, int newSize) {
        int[] newRoster = new int[newSize];

        int limit = Math.min(oldRoster.length, newSize);
        for (int i = 0; i < limit; i++) {
            newRoster[i] = oldRoster[i];
        }

        return newRoster;
    }

    public static void main(String[] args) {
        int[] oldRoster = new int[20];
        for (int i = 0; i < oldRoster.length; i++) {
            oldRoster[i] = 1000 + i;
        }

        int[] newRoster = expandRoster(oldRoster, 42);


        System.out.println("Old Roster: ");
        for (int i = 0; i < oldRoster.length; i++) {
            System.out.print(oldRoster[i] + " ");
        }
        System.out.println("\n");


        System.out.println("New Roster: ");
        for (int i = 0; i < newRoster.length; i++) {
            System.out.print(newRoster[i] + " ");
        }
    }
}