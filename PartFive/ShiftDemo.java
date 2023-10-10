// Демонстрация работы операций << и >>.
class ShiftDemo {
	public static void main(String [] args) {
		int val = 1;
		for(int i = 0; i < 8; i++) {
			for(int t=128; t > 0; t = t/2) {
				if((val & t) != 0) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
			val = val << 1; // сдвиг влево
		}
		System.out.println();
		int Q = 1;
		System.out.println(Q);
		for (int i = 0; i < 10; i++){
			Q = Q << 1;
			System.out.println(Q);
		}

		System.out.println();
		val = 128;
		for(int i = 0; i < 8; i++) {
			for(int t=128; t > 0; t = t/2) {
				if((val & t) != 0) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
			val = val >> 1; // сдвиг вправо
		}
		System.out.println();
		int W = 1024;
		System.out.println(W);
		for (int i = 0; i < 10; i++){
			W = W >> 1;
			System.out.println(W);
		}

	}
}
