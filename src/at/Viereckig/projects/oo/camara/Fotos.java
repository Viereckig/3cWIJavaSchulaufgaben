package at.Viereckig.projects.oo.camara;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fotos {
	private int size;
	private String name;
	private LocalDate date;
	
	public void dofoto(int size) {
		this.size = size;
		this.date = LocalDate.now();
		this.name = LocalDateTime.now().toString();
	}
}
