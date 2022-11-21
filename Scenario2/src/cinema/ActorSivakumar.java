package cinema;

public class ActorSivakumar implements Actor {
	static String address="coimbatore";
	 String car;
	 int num;
	ActorSivakumar(int num,String car){
		this.num=num;
		this.car=car;
		
	}

	public ActorSivakumar() {
		// TODO Auto-generated constructor stub
	}

	public void act() {
		// TODO Auto-generated method stub
		System.out.println("act");

	}

	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("dance");

	}

	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("sing");

	}
	public String speaking() {
		return "speak";
		
	}
	public static void main(String[] args) {
		ActorSivakumar as=new ActorSivakumar(65, "audi car");
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println(address);
		
	}

}
