class NestVar {
	public static void main(String[] args) {
		int count;
		for(count = 0; count < 5; count++) {
			System.out.println("Значение count: " + count);
			//int count; // Не разрешено!!!
			for(count = 0; count < 5; count++)
				System.out.println("Программа содержит ошибку!");
		}
	}
}
