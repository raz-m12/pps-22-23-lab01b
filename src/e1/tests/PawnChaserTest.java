package e1.tests;

import e1.gui.LogicsImpl;
import org.junit.jupiter.api.BeforeEach;

public class PawnChaserTest extends PieceTest {

    @BeforeEach
    void setup() {
        super.initFactory();
        var pawn = this.factory.getPawnAt(pawnInitialPosition);
        var knight = this.factory.getKnightAt(knightInitialPosition);
        app = new LogicsImpl(10, knight, pawn);
    }
}
