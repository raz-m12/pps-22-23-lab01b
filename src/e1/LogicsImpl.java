package e1;

import java.util.*;

public class LogicsImpl implements Logics {

	private final Pair<Integer,Integer> pawn;
	private final Random random = new Random();
	private final int size;
	private final JumpStrategy knightStrategy;
	 
    public LogicsImpl(int size){
    	this.size = size;
        this.pawn = this.randomEmptyPosition();
		this.knightStrategy = new KnightJumpStrategy(this.randomEmptyPosition());
    }


	public LogicsImpl(int size, Pair<Integer, Integer> initPawnPosition, Pair<Integer, Integer> initKnightPosition){
		this.size = size;
		this.pawn = initPawnPosition;
		this.knightStrategy = new KnightJumpStrategy(initKnightPosition);
	}

	private Pair<Integer,Integer> randomEmptyPosition(){
		Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
		// the recursive call below prevents clash with an existing pawn
		return this.pawn!=null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
	}
    
	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}

		var toBePosition = new Pair<>(row, col);
		if(this.knightStrategy.canJumpTo(toBePosition)) {
			this.knightStrategy.updatePosition(toBePosition);
			return this.pawn.equals(this.knightStrategy.getCurrentPosition());
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knightStrategy.selfLocatedAt(new Pair<>(row, col));
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.equals(new Pair<>(row,col));
	}
}
