class VarlnitDemo {
	public static void main(String[] args) {
		int x;
		for(x = 0; x < 3; x++) {
			int у = -1; // у инициализируется при каждом входе в блок
			System.out.println("Значение у равно: " + у); // всегда выводится -1
			у = 100;
			System.out.println("Теперь значение у равно: " + у);
		}
	}
}
