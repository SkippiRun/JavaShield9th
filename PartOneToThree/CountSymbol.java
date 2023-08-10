class CountSymbol{
	public static void main(String[] args) throws java.io.IOException{
		char inpt, ignore;
		int i = 0;
		for(;;){

		do {
			ignore = (char) System.in.read();
		} while(ignore != '\n' );

			System.out.print("Для выхода нажмите '.'\nВведите символ: ");
			inpt = (char) System.in.read();
//			System.out.println();
			if (inpt == ' ') i++;
			if (inpt == '.') break;
//			System.out.print("AAAAAA");
		}
		System.out.println("Количество пробелов: " + i);
	}
}
