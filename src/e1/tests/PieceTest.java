package e1.tests;

import e1.gui.Logics;
import e1.Pair;
import e1.factories.PieceFactory;
import e1.factories.PieceFactoryImpl;
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
