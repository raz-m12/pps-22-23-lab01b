package e1;

public class PawnJumpStrategy implements JumpStrategy {

    Pair<Integer, Integer> pawnPosition;
    public PawnJumpStrategy(Pair<Integer, Integer> initialPosition) {
        this.pawnPosition = initialPosition;
    }

    @Override
    public boolean canJumpTo(Pair<Integer, Integer> toBePosition) {
        throw new RuntimeException("Currently, the pawn cannot move.");
    }

    @Override
    public void updatePosition(Pair<Integer, Integer> newPosition) {
        this.pawnPosition = newPosition;
    }

    @Override
    public boolean selfLocatedAt(Pair<Integer, Integer> position) {
        return this.pawnPosition.equals(position);
    }

    @Override
    public boolean hits(JumpStrategy piece) {
        // TODO
        return false;
    }

    @Override
    public Pair<Integer, Integer> currentPosition() {
        return this.pawnPosition;
    }

}
