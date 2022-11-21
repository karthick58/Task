package country;

public class TamilNadu extends SouthIndia{
	static String capital="chennai";

	public TamilNadu(String PrimeMinister) {
		super(PrimeMinister);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(India.capital);
		System.out.println(TamilNadu.capital);
		SouthIndia si=new TamilNadu("Modi");
		si.cultivate();
		si.livingStyle();
		si.speakLanguages();
		si.eat();
		si.dress();
		

	}

	@Override
	void speakLanguages() {
		// TODO Auto-generated method stub
		System.out.println("Tamil");
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Rice");
		
	}

	@Override
	void dress() {
		// TODO Auto-generated method stub
		System.out.println("formal");
		
	}
	void cultivate() {
		super.cultivate();
		System.out.println("Rice and Sugar cane cultivation");
	}
	void livingStyle() {
		super.livingStyle();
		System.out.println("Above Average development");
	}

}
