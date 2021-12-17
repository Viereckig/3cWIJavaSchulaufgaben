package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
	private List<Record> records;
	private Record recordin = null;
	
	public Magazin() {
		this.records = new ArrayList<>();
	}
	
	public void addRecords(Record record) {
		this.records.add(record);
	}
	

	public void removeRecord(Record record) {
		this.records.remove(record);
	}
	
	public List<Record> getRecords() {
		return records;
	}

	public List<Record> findrecord(String name) {
		List<Record> foundTitle = new ArrayList<>();
		
		for (Record record : records) {
			for (Title title :record.getAllTitles()) {
				if (title.getName().contains(name)) {
					foundTitle.add(record);
				}
			}
			
		}
		
		return foundTitle;
	}
	
	public void loadRecord(Record record) {
		this.recordin = record;
	}
	
	public void unloadRecord(Record record) {
		if(this.recordin == null)
			System.out.println("Es ist keine Platte eingelegt");
		else
			this.recordin = null;
	}
	
	
	public void play(int nr) {
		if (this.recordin != null) {
			Title title = this.recordin.getAllTitles().get(nr);
			System.out.println("Es wird jetzt " + title.getName() + " abgespielt!");
		} else
			System.out.println("Es ist keine Platte eingelegt");
		
	}
	
}
