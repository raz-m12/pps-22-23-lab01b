package e1.strategies;

import e1.Pair;

public abstract class GenericJumpStrategy implements JumpStrategy {

    Pair<Integer, Integer> piecePosition;

    public abstract boolean canJumpTo(Pair<Integer, Integer> toBePosition);

    @Override
    public void updatePosition(Pair<Integer, Integer> newPosition) {
        this.piecePosition = newPosition;
    }

    @Override
    public boolean selfLocatedAt(Pair<Integer, Integer> position) {
        return this.piecePosition.equals(position);
    }

    @Override
    public boolean hits(JumpStrategy piece) {
        return this.currentPosition().equals(piece.currentPosition());
    }

    public Pair<Integer, Integer> currentPosition() {
        return this.piecePosition;
    }


}
