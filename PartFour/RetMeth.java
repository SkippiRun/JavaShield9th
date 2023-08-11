class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;

	int range(){
		return fuelcap*mpg;
	}

	void myMeth(){
		if (range() <= 200) System.out.println("Ууу, братец, далеко ты не уедешь.");
		else if(range() > 200) System.out.println("Ауф, пэхали, ИИИУУУ!!!");
	}
}

class RetMeth{
	public static void main(String[] args){

	Vehicle minivan = new Vehicle();
	Vehicle sportscar = new Vehicle();

	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;

	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;

	System.out.print("Минивэн может провезти " + minivan.passengers + " пассажиров. ");
	System.out.println("Минивэн может проехать " + minivan.range() + " миль.");
	minivan.myMeth();
	System.out.print("Спорткар может провезти " + sportscar.passengers + " пассажиров. ");
	System.out.println("Спорткар может проехать " + sportscar.range() + " миль.");
	sportscar.myMeth();

	if(minivan.range() > sportscar.range()) System.out.println("Минивэн проедет больше, чем спорткар.");
	else if(minivan.range() == sportscar.range()) System.out.println("Минивэн проедет столько же, сколько и спорткар.");
	else System.out.println("Запас ходя у минивэна и у спорткара одинаковый.");
	}
}
