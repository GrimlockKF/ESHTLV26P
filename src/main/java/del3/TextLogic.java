package del3;

public class TextLogic {

    private int lineCount = 0;
    private int totalCharacters = 0;
    private int wordCount = 0;
    private String longestWord = "";

    public TextLogic() {
    }

    public void addLine(String text) {
        lineCount++;
        totalCharacters += text.length();

        String cleanText = text.trim();

        if (!cleanText.isEmpty()) {
            String[] words = cleanText.split("\\s+");
            wordCount += words.length;

            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > longestWord.length()) {
                    longestWord = words[i];
                }
            }
        }
    }

    public boolean isStop(String text) {
        return text.equals("stop");
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getTotalCharacters() {
        return totalCharacters;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }
}