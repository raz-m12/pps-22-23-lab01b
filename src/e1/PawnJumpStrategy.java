package e1;

public class PawnJumpStrategy extends GenericJumpStrategy {

    public PawnJumpStrategy(Pair<Integer, Integer> initialPosition) {
        this.piecePosition = initialPosition;
    }

    @Override
    public boolean canJumpTo(Pair<Integer, Integer> toBePosition) {
        throw new RuntimeException("Currently, the pawn cannot move.");
    }

}
