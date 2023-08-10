class BreakDemo{
	public static void main(String[] args){
		int num = 100;
		for(int i=0; i < num; i++){
			if(i*i >= num) break;
			if (i*i >= 1) System.out.println("i = " + i);
		}
	System.out.println("End");
	}
}
