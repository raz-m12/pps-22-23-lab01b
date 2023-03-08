package e1.strategies;

import e1.Pair;

public interface JumpStrategy {
    /**
     * whether the seeker can jump to a given position,
     * the seeker is the active piece
     *
     * @param toBePosition at the given position
     * @return whether the jump is valid
     */
    boolean canJumpTo(Pair<Integer, Integer> toBePosition);
    /**
     * updates the position of the seeker
     *
     * @param newPosition the new position of the seeker
     */
    void updatePosition(Pair<Integer, Integer> newPosition);
    /**
     * checks whether the stored position is the same as the given position
     *
     * @param position the position used to test against
     * @return whether the given position is the same as the piece position
     */
    boolean selfLocatedAt(Pair<Integer, Integer> position);
    /**
     * checks whether the position stored inside the strategy
     * corresponds to the position given as parameter
     *
     * @param piece the piece to test against
     * @return true if the two positions coincide
     */
    boolean hits(JumpStrategy piece);
    /**
     * the current position of the piece stored inside the strategy
     *
     * @return the current position
     */
    Pair<Integer, Integer> currentPosition();
}
