package cinema;

class Sivakumar extends ActorSivakumar implements Actor{

	public Sivakumar(int num, String car) {
		// TODO Auto-generated constructor stub
		super(num,car);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor ac=new Sivakumar(63,"bmw");
		ac.act();
		ac.sing();
		ac.dance();
		System.out.println(ac.address);

	}

}
