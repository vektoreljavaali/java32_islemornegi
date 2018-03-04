package defaultpaket;

public class Runner {

	public static void main(String[] args) {
	
		
		dataveriabletype yeni = new dataveriabletype();
		dataveriabletype yeni2 = new dataveriabletype();

		System.out.println(yeni.kullanimsayisi);
	
	
		yeni.A();
		yeni.B();

		yeni.B();
		yeni2.A();
		yeni2.B();
		yeni2.A();
		yeni2.B();
		
		System.out.println(yeni2.kullanimsayisi);
		
		
	}

}
