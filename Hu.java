package shogi;

public class Hu extends Koma{
	
	public Hu(String user,boolean thisIsMyKoma,int[] presentLocation){
		super("歩",thisIsMyKoma,presentLocation);
		super.setCanMoveHere(0,LENGTH,-1);
		super.setCanMoveHere(0,WIDTH,0);
			
	}
	
	public void move(){
		
	}
}