package at.Viereckig.projects.oo.Fernbedienung;

public class Main {
	public static void main(String[] args) {
		Battery b1 = new Battery();
		Battery b2 = new Battery();
		
		remote r = new remote();
		r.setB1(b1);
		r.setB2(b2);
		r.turnon();
		System.out.println(r.getstatus());
	}
}
