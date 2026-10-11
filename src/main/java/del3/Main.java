package del3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextLogic logic = new TextLogic();

        System.out.println("Write text line by line.");
        System.out.println("Type 'stop' to exit.");

        while (true) {

            String text = scanner.nextLine();

            if (logic.isStop(text)) {
                break;
            }

            logic.addLine(text);
        }

        System.out.println("Lines: " + logic.getLineCount());
        System.out.println("Characters: " + logic.getTotalCharacters());
        System.out.println("Words: " + logic.getWordCount());
        System.out.println("Longest word: " + logic.getLongestWord());

        scanner.close();
    }
}