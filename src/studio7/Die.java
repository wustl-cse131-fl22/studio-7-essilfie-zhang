package studio7;

public class Die {
	private int integer;
	
	public int die(int n) {
	
		integer = (int)Math.random()*n+1; 
		
		return integer;
	}
	

}
