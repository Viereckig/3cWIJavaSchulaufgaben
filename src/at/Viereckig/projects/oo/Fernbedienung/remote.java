package at.Viereckig.projects.oo.Fernbedienung;

public class remote {
	private Battery b1;
	private Battery b2;
	
	public int getstatus() {
		int battery1 = b1.getbatterystatus();
		int battery2 = b2.getbatterystatus();
		return (battery1+battery2)/2;
	}
	
	
	
	public void setB1(Battery b1) {
		this.b1 = b1;
	}
	
	public Battery getB1() {
		return b1;
	}
	
	
	
	public void setB2(Battery b2) {
		this.b2 = b2;
	}
	
	public Battery getB2() {
		return b2;
	}
	
	
	public void turnon() {
		b1.loadbattery(-5);
		b2.loadbattery(-5);
	}
}
