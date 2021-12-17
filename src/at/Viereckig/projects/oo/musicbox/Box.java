package at.Viereckig.projects.oo.musicbox;

import java.util.List;

public class Box {
	private Magazin magazin;
	

	
	public void addRecord(Record record) {
		this.magazin.addRecords(record);
	}
	
	public void removeRecord(Record record) {
		this.magazin.removeRecord(record);
	}
	
	public int getSumOfMusic() {
		int sum = 0;
		List<Record> records = this.magazin.getRecords();
		for (Record record : records) {
			sum = sum + record.getSumOfRecord();
		}
		return sum;
	}
	
	public void loadRecord(Record record) {
		this.magazin.loadRecord(record);
	}
	
	public void play(int numOfRecord) {
		this.magazin.play(numOfRecord);
	}

	public Magazin getMagazin() {
		return magazin;
	}

	public void setMagazin(Magazin magazin) {
		this.magazin = magazin;
	}
	
	

}
