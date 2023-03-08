package e1.factories;

import e1.Pair;
import e1.strategies.JumpStrategy;
import e1.strategies.KnightJumpStrategy;
import e1.strategies.PawnJumpStrategy;

public class PieceFactoryImpl implements PieceFactory {
    @Override
    public JumpStrategy getPawnAt(Pair<Integer, Integer> position) {
        return new PawnJumpStrategy(position);
    }

    @Override
    public JumpStrategy getKnightAt(Pair<Integer, Integer> position) {
        return new KnightJumpStrategy(position);
    }
}
