class LogicalOpTable{
	public static void main(String[] args){
	/*	boolean p, q;
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		p = false; q = false;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = false; q = true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p =  true; q = false;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p =  true; q =  true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	*/	
	/*	boolean p, q;
                System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
                p = false; q = false;
		for (int i = 1; i <= 4; i++){

			if (p) System.out.print("1" + "\t");
			else System.out.print("0" + "\t");
			if (q) System.out.print("1" + "\t");
			else System.out.print("0" + "\t");
			if (p&q) System.out.print("1" + "\t");
			else System.out.print("0" + "\t");
			if (p|q) System.out.print("1" + "\t");
			else System.out.print("0" + "\t");
			if (p^q) System.out.print("1" + "\t");
			else System.out.print("0" + "\t");
			if (!p) System.out.println("1" + "\t");
			else System.out.println("0" + "\t");
			//System.out.println(i);
			if (i==1) {
			p = false;
			q = true;
			}
			if (i==2) {
			p = true;
			q = false;
			}
			if (i==3) p = q = true;
	*/
		int p, q;
                System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
                p = 0; q = 0;
                System.out.print(p + "\t" + q +"\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (1-p));
                p = 0; q = 1;
                System.out.print(p + "\t" + q +"\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (1-p));
                p =  1; q = 0;
                System.out.print(p + "\t" + q +"\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (1-p));
                p =  1; q =  1;
                System.out.print(p + "\t" + q +"\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (1-p));

	}
}
