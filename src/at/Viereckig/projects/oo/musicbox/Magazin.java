package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
	private List<Record> records;
	
	
	public Magazin() {
		this.records = new ArrayList<>();
	}
	
	public void addRecords(Record record) {
		this.records.add(record);
	}
	
	
	public void removeRecord(Record record) {
		this.records.remove(record);
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
	
}
