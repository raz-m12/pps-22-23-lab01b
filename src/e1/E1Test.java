package e1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class E1Test {
    Logics app;
    Pair<Integer, Integer> pawnInitialPosition = new Pair<>(3,3);;
    Pair<Integer, Integer> knightInitialPosition = new Pair<>(1,1);;
    @BeforeEach
    void beforeEach(){
        app = new LogicsImpl(10, pawnInitialPosition, knightInitialPosition);
    }

    @Test
    void knightAtStartPosition() {
        var knightX = knightInitialPosition.getX();
        var knightY = knightInitialPosition.getY();

        assertTrue(app.hasKnight(knightX, knightY));
    }

    @Test
    void knightNotAtPawnPosition() {
        var pawnX = pawnInitialPosition.getX();
        var pawnY = pawnInitialPosition.getY();

        assertFalse(app.hasKnight(pawnX, pawnY));
    }
}
