package at.Viereckig.projects.oo.camara;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fotos {
	private int size;
	private String name;
	private LocalDate date;
	
	
	public Fotos(int size) {
		this.size = size;
		this.date = LocalDate.now();
		this.name = LocalDateTime.now().toString();
		
	}


	public int getSize() {
		int realsize = 0;
		switch(size){
		case 0:
			realsize = 2;
			break;
		case 1:
			realsize = 4;
			break;
		
		case 2:
			realsize = 8;
			break;
		
		}
		return realsize;
	}


	public void setSize(int size) {
		this.size = size;
	}

	
	
	
	
	
	
}
