class ForTest{
	public static void main(String[] args)
	throws java.io.IOException{
		System.out.println("To end tap S");
		for(int i = 0; (char) System.in.read() != 'S'; i++)
			System.out.print("i = " + i);
	}
}
