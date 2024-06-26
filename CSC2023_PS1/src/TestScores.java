import java.util.ArrayList;
import java.util.Scanner;


public class TestScores {
    private String name;
    private ArrayList<Float> scores = new ArrayList<>();

    public TestScores(String name) {
        this.name = name;
    }

    public void addTestScore(float earned) {
        scores.add(earned);
    }

    public int getNumTestsTaken() {
        return scores.size();
    }

    public float getAverage() {
        if (scores.isEmpty()) {
            return 0.0f;
        }

        float sum = 0.0f;
        for (float score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.nextLine();

        TestScores testScores = new TestScores(name);

        float score;
        int count = 1;

        do {
            System.out.println("Enter score " + count + " or a negative number to exit");
            score = scanner.nextFloat();

            if (score >= 0) {
                testScores.addTestScore(score);
                count += 1;
            }
        } while (score >= 0);

        int numTestsTaken = testScores.getNumTestsTaken();
        float average = testScores.getAverage();

        String roundedNumber = String.format("%.1f", average);

        System.out.println("-- " + name + " --");
        System.out.println("Num tests taken: " + numTestsTaken);
        System.out.println("Average: " + roundedNumber);
    }
}
