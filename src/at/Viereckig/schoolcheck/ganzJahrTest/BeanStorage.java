package at.Viereckig.schoolcheck.ganzJahrTest;

public class BeanStorage {
	int maxCapacy = 2000;
	int capacy = 500;
	

	public int getMaxcapacy() {
		return maxCapacy;
	}

	public int getCapacy() {
		return capacy;
	}

	public void shortCapacy(int howmuchtoshort) {
		this.capacy = capacy - howmuchtoshort*10;
	}
	
	public void reFill() {
		this.capacy = maxCapacy;
	}
	
}
