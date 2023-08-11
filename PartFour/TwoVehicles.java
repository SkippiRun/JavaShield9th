class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;
}

class TwoVehicles{
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

	range1 = minivan.fuelcap*minivan.mpg;
	range2 = sportscar.fuelcap*sportscar.mpg;

	System.out.print("Минивэн может провезти " + minivan.passengers + " пассажиров ");
	System.out.println("на расстояние " + range1 + " миль");
	System.out.print("Спорткар может провезти " + sportscar.passengers + " пассажиров ");
	System.out.println("на расстояние " + range2 + " миль");
	}
}
