package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;

public class Record {
	ArrayList<Title> titles = new ArrayList();
	private String name;
	
	public Record(String name) {
		this.name = name;
		
	}
	
	
	
	public void addTitle(Title titles) {
		this.titles.add(titles);
	}
	
	public ArrayList<Title> getAllTitles(){
		return this.titles;
	}
	
	
	public String getTitels(int titelnummber) {
		Title test = titles.get(titelnummber);
		return test.getName();
	}
	
	public String getRecord(Title title) {
		
		return name;
	}
	
	public int getSumOfMusic() {
		int sum = 0;
		for (int i = 0; i < titles.size();i++) {
			
			sum = sum + titles.get(i).getDuration();
		}
		return sum;
	}
	
	public String getName() {
		return name;
	}
}
