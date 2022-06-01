import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        float score = 0.0F;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; ++i) {
            System.out.println("What was the score for game " + (i + 1));
            score += input.nextFloat();
            input.nextLine();
        }

        System.out.println("The mean score was " + score / 10.0F);
    }
}
