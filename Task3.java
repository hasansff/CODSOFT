import java.util.*;

public class Task3 {
    static Scanner sc = new Scanner(System.in);
    static int score = 0;

    static class Question {
        String question;
        String[] options;
        int correctAnswer;

        Question(String question, String[] options, int correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        void askQuestion(int number) {
            System.out.println("\nQ" + number + ": " + question);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            TimerTask task = new TimerTask() {
                public void run() {
                    System.out.println("\nTime's up!");
                    System.exit(0);
                }
            };

            Timer timer = new Timer();
            timer.schedule(task, 10000); 

            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();
            timer.cancel();

            if (answer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + correctAnswer);
            }
        }
    }

    public static void main(String[] args) {
        Question[] questions = {
            new Question("What is the capital of India?",
                    new String[]{"Mumbai", "New Delhi", "Kolkata", "Chennai"}, 2),

            new Question("Which planet is known as the Red Planet?",
                    new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 2),

            new Question("Who wrote 'Romeo and Juliet'?",
                    new String[]{"Charles Dickens", "Mark Twain", "William Shakespeare", "Leo Tolstoy"}, 3)
        };

        System.out.println("Welcome to the Quiz! You have 10 seconds per question.");

        for (int i = 0; i < questions.length; i++) {
            questions[i].askQuestion(i + 1);
        }

        System.out.println("\nQuiz Over!");
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
 
