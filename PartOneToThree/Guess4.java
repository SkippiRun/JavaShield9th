class Guess4{
	public static void main(String[] args)
	throws java.io.IOException{
		char ch, ignore, answer = 'q';
		do {
			System.out.println("Введите букву");
			ch = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
//				System.out.println("ignore = " + ignore);
			} while(ignore != '\n');

			if(ch == answer) System.out.println("верно");
			else{
				System.out.print("неверно, ");
				if (ch < answer) System.out.println("ближе к z");
				else System.out.println("ближе к a");
			}
		} while (ch != answer);
	}
}
