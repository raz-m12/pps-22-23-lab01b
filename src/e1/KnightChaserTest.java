package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightChaserTest extends PieceTest {

    @BeforeEach
    void setup() {
        super.initFactory();
        var pawn = this.factory.getPawnAt(pawnInitialPosition);
        var knight = this.factory.getKnightAt(knightInitialPosition);
        app = new LogicsImpl(10, pawn, knight);
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
