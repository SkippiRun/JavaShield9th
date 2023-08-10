class Help{
	public static void main(String[] agrs) throws java.io.IOException{
		char inpt;
		System.out.println("Справка по:\n1. if\n2. switch\nВыберите вариант: ");
		inpt = (char) System.in.read();
		//System.out.println("inpt = "+inpt);
		switch (inpt){
			case '1':
				System.out.println("Оператор if:\nif(условие) оператор;");
				System.out.println("else оператор;");
				break;
			case '2':
				System.out.print("Традиционный оператор switch:\nswitch");
				System.out.print("(выражение) {\n case константа:\n  ");
				System.out.print("последовательность операторов\n  break;\n");
				System.out.println(" / / ...\n}");
				break;
			default: System.out.println("Выбранный оператор не найден");
		}
	}
}
