package shogi;

public class Koma {
	

	public final int LENGTH = 0;
	public final int WIDTH  = 1;
	
	

	private String  name;
	private boolean  thisIsMyKoma;
	private int[] presentLocation = new int[2];
	private int[][] canMoveHere = new int[17][2];	
	
	public Koma(String name,boolean thisIsMyKoma,int[] presentLocation) {
		
		this.name = name;
		this.thisIsMyKoma = thisIsMyKoma;
		this.presentLocation = presentLocation;
		
	}

	public void move(int[] wantToMove){
		
		boolean canYouMoveThere;
		
		for(int i = 0; canMoveHere[i][LENGTH] == 0 | canMoveHere[i][WIDTH] == 0; i++){
			
			System.out.println(canMoveHere[i][LENGTH] + "" + canMoveHere[i][WIDTH]);
				
//			canYouMoveThere = canMoveHere[i][LENGTH] == wantToMove[LENGTH]
//									| canMoveHere[i][WIDTH] == wantToMove[WIDTH];
//				
//			if(canYouMoveThere){
//				presentLocation = wantToMove;
//			}
//				
//			if(canMoveHere[i][LENGTH] != END){
//				System.out.println("そこには動けません");
//			}
		}	
	}

	public void setCanMoveHere(int No,int lengthOrWidth,int value) {
		this.canMoveHere[No][lengthOrWidth] = value;
	}
}
 