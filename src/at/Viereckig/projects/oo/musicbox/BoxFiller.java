package at.Viereckig.projects.oo.musicbox;

public class BoxFiller {
	
	
	public static Box fillBox(Box box) {
	
		Magazin magazine = new Magazin();
		box.setMagazin(magazine);
		
		Record rec1 = new Record("Ages of love");
		Record rec2 = new Record("Strengh");
		Record rec3 = new Record("james");
		
		
		
		Title t1 = new Title("Love",1);
		Title t2 = new Title("Break",5);
		Title t3 = new Title("Toxic",10);
		Title t4 = new Title("Love",4);
		Title t5 = new Title("Love",8);
		Title t6 = new Title("Love",2);
		Title t7 = new Title("Love",9);
		Title t8 = new Title("Love",23);
		Title t9 = new Title("Love",14);
	
	
		
		rec1.addTitle(t1);
		rec1.addTitle(t2);
		rec1.addTitle(t3);
		
		rec2.addTitle(t4);
		rec2.addTitle(t5);
		rec2.addTitle(t6);
		
		rec3.addTitle(t7);
		rec3.addTitle(t8);
		rec3.addTitle(t9);
		
		
		magazine.addRecords(rec1);
		magazine.addRecords(rec2);
		magazine.addRecords(rec3);
		return box;
	}
}
