class Factor {
	boolean isFactor(int a, int b) {
		if( (b % a) == 0) return true;
		else return false;
	}
}

class IsFact {
	public static void main(String[] args) {

	Factor x = new Factor();

	if(x.isFactor(2,20)) System.out.println( "2 - множитель.");
	if(x.isFactor(3,20)) System.out.println( "3 - множитель.");
	if(x.isFactor(4,20)) System.out.println( "4 - множитель.");
	if( x.isFactor(5, 20)) System.out.println( "5 - множитель.");

	}
}
