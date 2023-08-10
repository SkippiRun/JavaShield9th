class CharArithDemo {
	public static void main(String[] args) {
		char ch;
		ch = 'X';
		System.out.println("ch содержит " + ch);
		ch++;
		System.out.println("ch теперь содержит " + ch);
		ch = 90;
		System.out.println("ch теперь содержит " + ch);
		ch = 'a';
		for(int i = 0; i<26; i++){
			System.out.println("ch содержит " + ch);
			ch++;
		}
	}
}
