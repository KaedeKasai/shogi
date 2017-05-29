package shogi;

public class Koma {
	
	private final int LENGTH = 0;
	private final int WIDTH  = 1;
	
	
	
	private String  name;
	private boolean  thisIsMyKoma;
	private int[] presentLocation = new int[2];
	
	public Koma(String name,boolean  thisIsMyKoma,int[] presentLocation) {
		
		this.name = name;
		this.thisIsMyKoma = thisIsMyKoma;
		this.presentLocation[LENGTH] = presentLocation[LENGTH];
		this.presentLocation[WIDTH] = presentLocation[WIDTH];
		
	}

	public void move(boolean[] canMove){
		
		if(true){
			
		}
		
		
		
	}

}
