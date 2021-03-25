package Deck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeckTests {

    @Test
    public void deck_init() {
        Deck<Integer> deck = new Deck<Integer>();
    }

    @Test
    public void getSize_emptyArray() {
        Deck<Integer> deck = new Deck<Integer>();

        int expected = 0;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getSize_NotEmptyArray() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushFront(0);
        deck.pushFront(0);

        int expected = 2;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void peekFront_EmptyArray() {
        Deck<Integer> deck = new Deck<Integer>();

        String error_message = deck.get_errorMessage("deckIsEmptyError");

        assertThrows(RuntimeException.class, deck::peekFront, error_message);
    }

    @Test
    public void peekFront_NotEmptyArray() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushFront(1);
        deck.pushFront(0);

        int expected = 0;
        int actual = deck.peekFront();
        assertEquals(expected, actual);
    }

    @Test
    public void pushFront_sizeValidation() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushFront(0);
        deck.pushFront(0);

        int expected = 2;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void pushFront_dataValidation() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushFront(1);
        deck.pushFront(2);

        int expected = 2;
        int actual = deck.peekFront();
        assertEquals(expected, actual);
    }
}
