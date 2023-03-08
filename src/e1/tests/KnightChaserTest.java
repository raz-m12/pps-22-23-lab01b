package e1.tests;

import e1.gui.LogicsImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        Assertions.assertTrue(app.hasKnight(knightX, knightY));
    }

    @Test
    void knightNotAtPawnPosition() {
        var pawnX = pawnInitialPosition.getX();
        var pawnY = pawnInitialPosition.getY();

        Assertions.assertTrue(app.hasPawn(pawnX, pawnY));
    }

    @Test
    void knightCanMove() {
        var newX = 1;
        var newY = 2;
        app.hit(newX, newY);

        Assertions.assertTrue(app.hasKnight(newX, newY));
    }

    @Test
    void knightCanCapturePawn() {
        app.hit(1, 2);

        Assertions.assertTrue(app.hit(2, 0));
    }
}
