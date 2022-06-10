package at.Viereckig.schoolcheck.ganzJahrTest;

public class WaterTank {
	int maxCapacy = 1000;
	int capacy = 500;
	
	

	public int getMaxcapacy() {
		return maxCapacy;
	}

	public int getCapacy() {
		return capacy;
	}

	public void shortCapacy(int howmuchtoshort) {
		this.capacy = capacy - howmuchtoshort;
	}
	
	public void reFill() {
		this.capacy = maxCapacy;
	}
	
	
	
	
}
