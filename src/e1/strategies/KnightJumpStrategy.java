package e1.strategies;

import e1.Pair;

public class KnightJumpStrategy extends GenericJumpStrategy {


    public KnightJumpStrategy(Pair<Integer, Integer> initialPosition) {
        this.piecePosition = initialPosition;
    }

    @Override
    public boolean canJumpTo(Pair<Integer, Integer> toBePosition) {
        int x = toBePosition.getX()-this.piecePosition.getX();
        int y = toBePosition.getY()-this.piecePosition.getY();
        return x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3;
    }
}
