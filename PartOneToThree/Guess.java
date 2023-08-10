class Guess{
	public static void main(String[] args) throws java.io.IOException{
		char ch, answer = 'K';
		System.out.print("угадайте букву от A до Z\nВведите букву: ");
		ch = (char) System.in.read();
		if (ch == answer) System.out.println("Правильно!");
		else {
			System.out.print("Неверно! Буква находится ");
			if(ch < answer) System.out.println("Ближе к Z");
			else System.out.println("Ближе к A");
		}
	}
}
