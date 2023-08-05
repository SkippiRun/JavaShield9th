class KbIn{
	public static void main(String[] args) 
		throws java.io.IOException{
		char ch;
		System.out.print("tap to key and then tap the ENTER: ");
		ch = (char) System.in.read();
		System.out.println("yours key is a " + ch);
	}
}
