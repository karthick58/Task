package india.newDelhi;

import tamilnadu.madras.TrafficRulesChennai;

class CommonManInDelhi implements TrafficRulesDelhi,TrafficRulesChennai{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManInDelhi cmi=new CommonManInDelhi();
		cmi.dontGoByDieselVehicle();
		cmi.goByBicycle();
		cmi.goByDieselVehicle();

	}

	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Petrol");
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("cycle");
		
	}

	@Override
	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("diesel car");
		
	}

}
