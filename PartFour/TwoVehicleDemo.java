class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;

	void range(){
		System.out.println("Дальность поездки составляет "+fuelcap*mpg+" миль");
	}
}

class TwoVehicleDemo{
	public static void main(String[] args){

	Vehicle minivan = new Vehicle();
	Vehicle sportscar = new Vehicle();

	int range1, range2;

	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;

	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;

	System.out.print("Минивэн может провезти " + minivan.passengers + " пассажиров. ");
	minivan.range();
	System.out.print("Спорткар может провезти " + sportscar.passengers + " пассажиров. ");
	sportscar.range();
	}
}
