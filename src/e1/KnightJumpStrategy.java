package e1;

public class KnightJumpStrategy implements JumpStrategy {

    Pair<Integer, Integer> knightPosition;

    public KnightJumpStrategy(Pair<Integer, Integer> initialPosition) {
        this.knightPosition = initialPosition;
    }

    @Override
    public boolean canJumpTo(Pair<Integer, Integer> toBePosition) {
        int x = toBePosition.getX()-this.knightPosition.getX();
        int y = toBePosition.getY()-this.knightPosition.getY();
        return x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3;
    }

    @Override
    public void updatePosition(Pair<Integer, Integer> newPosition) {
        this.knightPosition = newPosition;
    }

    @Override
    public boolean selfLocatedAt(Pair<Integer, Integer> position) {
        return this.knightPosition.equals(position);
    }

    @Override
    public boolean hits(JumpStrategy piece) {
        var position = piece.currentPosition();
        // -> this.currentPosition().equals(piece.currentPosition());
        return position.equals(this.knightPosition);
    }

    @Override
    public Pair<Integer, Integer> currentPosition() {
        return this.knightPosition;
    }

}
