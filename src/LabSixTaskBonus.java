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

