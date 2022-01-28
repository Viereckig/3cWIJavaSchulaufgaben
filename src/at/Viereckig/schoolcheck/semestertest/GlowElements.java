package at.Viereckig.schoolcheck.semestertest;

public class GlowElements {
	private String name;
	private String color;
	private int powerconsumption;
	private boolean status;
	
	
	public GlowElements(String name, String color) {
		this.name = name;
		this.color = color;
		this.status = false;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	public int getPowerconsumption() {
		return powerconsumption;
	}
	
	public void turnon() {
		if (status == false) {
			this.powerconsumption = powerconsumption + 5;
			this.status = true;
		} else {
			System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet");
		}
		
		
	}
	
	public void turnoff() {

		this.status = false;

		
	}
	
	
	
	
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
