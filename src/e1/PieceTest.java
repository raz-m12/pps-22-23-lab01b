package e1;

import org.junit.jupiter.api.BeforeEach;


/**
 * Backlog
 * 1. Refactoring: use a strategy for deciding the behavior of the knight.
 */

abstract class PieceTest {
    Logics app;
    PieceFactory factory;
    Pair<Integer, Integer> pawnInitialPosition = new Pair<>(2,0);
    Pair<Integer, Integer> knightInitialPosition = new Pair<>(0,0);
    @BeforeEach
    void initFactory(){
        this.factory = new PieceFactoryImpl();
    }


}
