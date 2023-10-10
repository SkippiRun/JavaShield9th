//Show bits inside bytes
class ShowBits{
	public static void main(String args[]){
		byte val = 123;
		int i = 128;
		for (; i>0; i/=2){
			if ((val & i) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
		System.out.println();
	}
}
