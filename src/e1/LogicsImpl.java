package e1;

import java.util.*;

public class LogicsImpl implements Logics {

	private final Random random = new Random();
	private final int size;
	private final JumpStrategy seeker;
	private final JumpStrategy concealedPiece;
	 
    public LogicsImpl(int size){
    	this.size = size;
        this.concealedPiece = new PawnJumpStrategy(this.randomEmptyPosition());
		this.seeker = new KnightJumpStrategy(this.randomEmptyPosition());
    }


	public LogicsImpl(int size, Pair<Integer, Integer> initPawnPosition, Pair<Integer, Integer> initKnightPosition){
		this.size = size;
		this.concealedPiece = new PawnJumpStrategy(initPawnPosition);
		this.seeker = new KnightJumpStrategy(initKnightPosition);
	}
    
	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}

		var toBePosition = new Pair<>(row, col);
		if(this.seeker.canJumpTo(toBePosition)) {
			this.seeker.updatePosition(toBePosition);
			return this.seeker.hits(this.concealedPiece);
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.seeker.selfLocatedAt(new Pair<>(row, col));
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.concealedPiece.selfLocatedAt(new Pair<>(row,col));
	}

	private Pair<Integer,Integer> randomEmptyPosition(){
		Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
		var pawn = this.concealedPiece.currentPosition();
		return pawn!=null && pawn.equals(pos) ? randomEmptyPosition() : pos;
	}
}
