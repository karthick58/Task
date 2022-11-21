package mobile.factory;

public class Samsung extends FactoryDemo{
	int price=5000;

	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung sam=new Samsung();//called smartphone constructor
		sam.browse();             //called FactoryDemo class
		System.out.println(sam.price);//called current samsung

	}

	@Override
	void verifyFingerPrint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void providePattern() {
		// TODO Auto-generated method stub
		
	}

	@Override
	int call(int seconds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
		
	}

}
