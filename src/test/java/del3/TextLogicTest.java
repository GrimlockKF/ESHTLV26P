package del3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TextLogicTest {

    @Test
    void shouldCountWords() {

        TextLogic logic = new TextLogic();

        logic.addLine("Java is fun");
        logic.addLine("QA testing");

        assertEquals(5, logic.getWordCount());
    }

    @Test
    void shouldFindLongestWord() {

        TextLogic logic = new TextLogic();

        logic.addLine("Java is fun");
        logic.addLine("I am learning automation");

        assertEquals("automation", logic.getLongestWord());
    }

    @Test
    void shouldHandleEmptyLines() {

        TextLogic logic = new TextLogic();

        logic.addLine("");
        logic.addLine("   ");

        assertEquals(2, logic.getLineCount());
        assertEquals(3, logic.getTotalCharacters());
        assertEquals(0, logic.getWordCount());
        assertEquals("", logic.getLongestWord());
    }

    @Test
    void shouldRecognizeStop() {

        TextLogic logic = new TextLogic();

        assertTrue(logic.isStop("stop"));
        assertFalse(logic.isStop("Stop"));
        assertFalse(logic.isStop("stop "));
        assertFalse(logic.isStop("Java"));
    }
}
