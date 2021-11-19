package at.Viereckig.projects.oo.Fernbedienung;

public class Main {
	public static void main(String[] args) {
		Battery b1 = new Battery(60);
		Battery b2 = new Battery(85);
		
		remote r = new remote();
		r.setB1(b1);
		r.setB2(b2);
		r.turnon();
		System.out.println(r.getstatus());
	}
}
