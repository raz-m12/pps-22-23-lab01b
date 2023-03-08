package e1;

public interface JumpStrategy {
    boolean canJumpTo(Pair<Integer, Integer> toBePosition);
    void updatePosition(Pair<Integer, Integer> newPosition);
    boolean selfLocatedAt(Pair<Integer, Integer> position);
    Pair<Integer, Integer> getCurrentPosition();
}
