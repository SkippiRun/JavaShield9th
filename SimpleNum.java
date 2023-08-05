class SimpleNum{
	public static void main(String[] args){
		int i, j;
		boolean prime;
		for (i=2; i < 101; i++){
			prime = true;
			for (j=2; j <= i/j; j++) //для 2,3 не выполняется условие
				       		 //для 4-101 выполняется
				if ((i%j) == 0) prime = false;
			if (prime) System.out.println(i + "\t" + prime);
		}
	}
}
