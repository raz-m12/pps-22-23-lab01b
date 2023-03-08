package e1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Backlog
 * 1. Refactoring: use a strategy for deciding the behavior of the knight.
 */

public class E1Test {
    Logics app;
    Pair<Integer, Integer> pawnInitialPosition = new Pair<>(2,0);
    Pair<Integer, Integer> knightInitialPosition = new Pair<>(0,0);
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

        assertTrue(app.hasPawn(pawnX, pawnY));
    }

    @Test
    void knightCanMove() {
        var newX = 1;
        var newY = 2;
        app.hit(newX, newY);

        assertTrue(app.hasKnight(newX, newY));
    }

    @Test
    void knightCanCapturePawn() {
        app.hit(1, 2);

        assertTrue(app.hit(2, 0));
    }
}
