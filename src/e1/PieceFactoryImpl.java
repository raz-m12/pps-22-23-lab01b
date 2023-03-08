package e1;

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
