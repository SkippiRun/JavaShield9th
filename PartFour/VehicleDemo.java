class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;
}

class VehicleDemo{
	public static void main(String[] args){

	Vehicle minivan = new Vehicle();

	int range;

	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;

	range = minivan.fuelcap*minivan.mpg;
	System.out.print("Минивэн может провезти " + minivan.passengers + " пассажиров ");
	System.out.println("на расстояние " + range + " миль");
	}
}
