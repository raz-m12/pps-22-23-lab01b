package e1;

public interface PieceFactory {
    JumpStrategy getPawnAt(Pair<Integer, Integer> position);
    JumpStrategy getKnightAt(Pair<Integer, Integer> position);
}
