class Help3{
	public static void main(String[] agrs) throws java.io.IOException{
	char inpt, ignore;
	for (;;) {
		do {
			System.out.print("Справка по:\n1. if\n2. switch\n3. for\n4. while\n");
			System.out.print("5. do-while\n6. break\n7. continue\n");
			System.out.println("Для выхода нажмите q\nВыберите вариант: ");
			inpt = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		} while(inpt < '1' | inpt > '7' & inpt != 'q');
//System.out.println("inpt = "+inpt);
		if (inpt == 'q') break;
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
			case '3':
				System.out.print("Цикл for:\n");
				System.out . print("for(инициализация; условие; итерация)");
				System.out . println(" оператор;");
				break;
			case '4':
				System.out.print("Цикл while:\n");
				System.out.println("while(условие) оператор;");
				break;
			case '5':
				System.out.print("Цикл do-while:\n");
				System.out.println("do {");
				System.out.println(" оператор;");
				System.out.println("} while (условие);");
				break;
			case '6':
				System.out.println("Оператор break:\n");
				System.out.println("break; или break метка;");
				break;
			case '7':
				System.out.println("Оператор continue:\n");
				System.out.println("continue; или continue метка;");
				break;
		}
		System.out.println();
	}
	}
}
