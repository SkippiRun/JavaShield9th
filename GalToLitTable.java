class GalToLitTable {
	public static void main(String[] args) {
		double inch, meter, inchsToMeters;
		int counter;
		inchsToMeters = 39.37;
		counter = 0;
		for(inch = 1; inch <= 144; inch++) {
			meter = inch *inchsToMeters;
			System.out.println(inch + " дюймов соответствует " +
				meter + " метрам.");
			counter++;
			// После каждой 12-й строки вывести пустую строку ,
			if(counter == 12) {
				System.out.println();
				counter = 0; // сброс счетчика строк
			}
		}
	}
}
