class Vehicle {

	int passengers;
	int fuelcap;
	int mpg;

	Vehicle (int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
}

	int range () {
	return mpg * fuelcap;
}

	double fuelNeeded (double miles) {
	return (double) miles / mpg;
}
}

class VehConsDemo {
	public static void main(String[] args) {

	Vehicle minivan = new Vehicle(7, 16, 21);
	Vehicle sportscar = new Vehicle(2, 14, 12);

	double gallons, dist = 300.4;

	gallons = minivan.fuelNeeded(dist);
	System.out.print("Для поездки на расстояние " + dist + " миль минивэну требуется ");
	System.out.println(gallons + " галлонов топлива.");

	gallons = sportscar.fuelNeeded(dist);
	System.out.print("Для поездки на расстояние " + dist + " миль спорткару требуется ");
	System.out.println(gallons + " галлонов топлива.");
}
}
