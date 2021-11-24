package at.Viereckig.projects.oo.fernbedienung;

public class Battery {
	private int chargingstatus;
	
	public Battery() {
		this.chargingstatus = 100;
	}
	
	public Battery(int batterystatus) {
		this.chargingstatus = batterystatus;
	}
	
	public int getbatterystatus() {
		return this.chargingstatus;
	}
	
	public void loadbattery(int ladewert) {
		this.chargingstatus = this.chargingstatus + ladewert;
	}
}
