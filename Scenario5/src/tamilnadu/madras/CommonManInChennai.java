package tamilnadu.madras;

class CommonManInChennai implements TrafficRulesChennai{
	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("jeep");
		
	}

	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("cycle");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManInChennai cmi=new CommonManInChennai();
		cmi.goByDieselVehicle();
		cmi.goByBicycle();

	}

	

}
