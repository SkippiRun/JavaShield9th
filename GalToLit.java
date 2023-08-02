class GalToLit {
	public static void main(String[] args) {
		double gallons; // хранит количество галлонов
		// хранит результат преобразования в литры
		double liters;
		double GalToLit = 3.7854;
		gallons = 10;
		// начать с 10 галлонов
		liters = gallons * GalToLit; // преобразование в литры
		System.out.println(gallons + " галлонов соответствует "
			+ liters + " литрам.");
	}
}
