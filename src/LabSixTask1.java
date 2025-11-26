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