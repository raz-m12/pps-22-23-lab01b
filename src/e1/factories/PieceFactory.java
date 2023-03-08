package e1.factories;

import e1.Pair;
import e1.strategies.JumpStrategy;

public interface PieceFactory {
    /**
     * an object used to manage a pawn at a given position.
     *
     * @param position at the given position
     * @return the pawn strategy
    */
    JumpStrategy getPawnAt(Pair<Integer, Integer> position);
    /**
     * an object used to manage a knight at a given position.
     *
     * @param position at the given position
     * @return the knight strategy
     */
    JumpStrategy getKnightAt(Pair<Integer, Integer> position);
}
