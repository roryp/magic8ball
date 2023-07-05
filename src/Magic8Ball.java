import java.util.Random;

public class Magic8Ball {

    void main(String[] args) throws InterruptedException {
        var answers = new String[] {
                "Yes",
                "No.",
                "Maybe",
                "Drink more coffee.",
                "Ask ChatGPT"
        };

        var random = new Random();
        var answer = answers[random.nextInt(
            answers.length)];

        Thread.startVirtualThread(() -> 
            System.out.println("The magic 8 ball "+
            "says: " + answer))
        .join();
    }
}