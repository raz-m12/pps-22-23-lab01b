package e1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class E1Test {
    Logics app;
    @BeforeEach
    void beforeEach(){
        var pawnPos = new Pair<>(3,3);
        var knightPos = new Pair<>(1,1);
        app = new LogicsImpl(10, pawnPos, knightPos);
    }

    @Test
    void knightAtStartPosition() {
        assertTrue(app.hasKnight(1, 1));
    }
}
