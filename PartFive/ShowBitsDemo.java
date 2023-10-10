class ShowBits2{
	int numbits;

	ShowBits2(int n){
		numbits = n;
	}

	void show(long val){
		long mask = 1;
		mask <<= numbits-1;

		int spacer = 0;
		for (; mask != 0; mask >>>=1){
			System.out.println("\nmask = "+mask+"\tval = "+val+"\tval & mask = "+(val & mask));
			if ((val & mask) != 0) System.out.print("1");
			else System.out.print("0");
			spacer++;
			if ((spacer%8) == 0){
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
}
class ShowBitsDemo{
	public static void main(String args[]){
		ShowBits2 b = new ShowBits2(8);
		ShowBits2 i = new ShowBits2(32);
		ShowBits2 li = new ShowBits2(64);
		System.out.println("Двоичное представление значения 123: ");
		b.show(123);
		System.out.println("\nДвоичное представление значения 87987: ");
		i.show(87987);
		System.out.println("\nДвоичное представление значения 237658768: ");
		li.show(237658768);
		//Можно также отображать младшие биты любого целочисленного значения
		System.out.println("\nМладшие 8 битов значения 87987: ");
		b.show(87987);
	}
}
