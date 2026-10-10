package del2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TextLogicTest {

    @Test
    void shouldCountOneLine() {

        TextLogic logic = new TextLogic();

        logic.addLine("Java");

        assertEquals(1, logic.getLineCount());
        assertEquals(4, logic.getTotalCharacters());
    }

    @Test
    void shouldCountMultipleLines() {

        TextLogic logic = new TextLogic();

        logic.addLine("Java");
        logic.addLine("Hello");
        logic.addLine("QA");

        assertEquals(3, logic.getLineCount());
        assertEquals(11, logic.getTotalCharacters());
    }

    @Test
    void shouldCountEmptyLine() {

        TextLogic logic = new TextLogic();

        logic.addLine("");

        assertEquals(1, logic.getLineCount());
        assertEquals(0, logic.getTotalCharacters());
    }

    @Test
    void shouldRecognizeStop() {

        TextLogic logic = new TextLogic();

        assertTrue(logic.isStop("stop"));
        assertFalse(logic.isStop("Stop"));
        assertFalse(logic.isStop("Hello stop"));
    }

    @Test
    void shouldNotCountStop() {

        TextLogic logic = new TextLogic();

        logic.addLine("Java");

        String text = "stop";

        if (!logic.isStop(text)) {
            logic.addLine(text);
        }

        assertEquals(1, logic.getLineCount());
        assertEquals(4, logic.getTotalCharacters());
    }
}



