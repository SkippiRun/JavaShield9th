class AsciiTans{
	public static void main(String[] args) throws java.io.IOException{
		char ch, ignore;
		int changes = 0;
		System.out.println("Введите буквы a-z или A-Z");
		do {
			ch = (char) System.in.read();
			do{
				ignore = (char) System.in.read();
			} while (ignore != '\n');
//			System.out.println((int) ch);
			if (ch >= 'a' & ch <= 'z'){
				ch-= 32;
				changes ++;
			}
			else if (ch >= 'A' & ch <= 'Z'){
				ch+=32;
				changes ++;
			}
			System.out.println(ch); // + "\tВсего изменений: "+ changes);
		} while (ch != '.');
		System.out.println("Всего изменений: "+ changes);
	}
}
