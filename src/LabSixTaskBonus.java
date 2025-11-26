/* Bonus Question:
Write a program that creates a 2D integer array scores (5 students, 4 quizzes), fills it with
random values in the range 0–100, and prints the table as a neat grid (each row on its own
line). After printing, compute and print each student’s average (row averages) and each quiz’s
average (column averages), formatted to two decimals. Finally, find the highest score in the
table and print its value and its location as (studentIndex, quizIndex); if more than
one cell shares the highest value, report the one with the smallest studentIndex, and if
still tied, the smallest quizIndex. */

import java.util.Random;

public class LabSixTaskBonus {
    public static void main(String[] args) {
        Random rnd = new Random();

        int students = 5;   // number of rows
        int quizzes = 4;    // number of columns
        int[][] scores = new int[students][quizzes]; // 2D array [5][4]

        // fill the table with random scores (0â€“100)
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                scores[i][j] = rnd.nextInt(101); // 0â€“100 inclusive
            }
        }

        // print table
        System.out.println("Scores Table:");
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                System.out.printf("%4d", scores[i][j]); // format: 4 spaces wide
            }
            System.out.println();
        }

        System.out.println("Student Averages:");
        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < quizzes; j++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / quizzes;
            System.out.printf("Student %d: %.2f%n", i, avg);
        }

        System.out.println("Quiz Averages:");
        for (int j = 0; j < quizzes; j++) {
            int sum = 0;
            for (int i = 0; i < students; i++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / students;
            System.out.printf("Quiz %d: %.2f%n", j, avg);
        }

        int highestScore = scores[0][0];
        int bestStudent = 0;
        int bestQuiz = 0;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                if (scores[i][j] > highestScore) {
                    highestScore = scores[i][j];
                    bestStudent = i;
                    bestQuiz = j;
                }
            }
        }

        System.out.printf("Highest score: %d at (studentIndex=%d, quizIndex=%d)%n",
                highestScore, bestStudent, bestQuiz);
    }
}

