package payilagam.chennai;


public class Trainer {
	String dept="Java";
	String institute="Payilagam";
	private int salary=10000;
	 //String trainerName;
	 
	Trainer(String dept,String institute){
		this.dept=dept;
		this.institute=institute;
	}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Trainer trainerkumar=new Trainer("CSE","payilagam");
	 System.out.println();
	 trainerkumar.training();
     System.out.println(trainerkumar.dept);
	 
	}
 void training() {
	 System.out.println("Department: "+dept);
	 System.out.println("Training Institute: "+institute);
	 System.out.println("Learning");
	 System.out.println("java");
 }
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
