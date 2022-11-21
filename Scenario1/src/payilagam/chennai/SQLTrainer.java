package payilagam.chennai;

public class SQLTrainer extends Trainer{
	
	 
	SQLTrainer(String dept,String institute) {
		super(dept,institute);
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQLTrainer ram=new SQLTrainer( "Sql","payilagam");
		ram.training();
		System.out.println(ram.dept);
		System.out.println(ram.institute);
		System.out.println(ram.getSalary());

	}
	
}
