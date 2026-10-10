package del2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextLogic logic = new TextLogic();

        while (true) {

            String text = scanner.nextLine();

            if (logic.isStop(text)) {
                break;
            }

            logic.addLine(text);
        }

        System.out.println("Lines: " + logic.getLineCount());
        System.out.println("Characters: " + logic.getTotalCharacters());

        scanner.close();
    }
}