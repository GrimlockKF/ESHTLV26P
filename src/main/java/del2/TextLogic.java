package del2;

public class TextLogic {

    int lineCount = 0;
    int totalCharacters = 0;

    boolean isStop(String text) {
        return text.equals("stop");
    }

    void addLine(String text) {
        lineCount++;
        totalCharacters += text.length();
    }

    int getLineCount() {
        return lineCount;
    }

    int getTotalCharacters() {
        return totalCharacters;
    }
}