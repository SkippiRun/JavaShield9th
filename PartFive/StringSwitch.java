// Использование строк для управления оператором switch ,
class StringSwitch {
	public static void main(String[] args) {
		String command = "cancel";
		switch(command ) {
			case "connect":
				System.out.println("Подключение");
				break;
			case "cancel":
				System.out.println ("Отмена");
				break;
			case "disconnect":
				System.out. println("Отключение");
				break;
			default:
				System.out.println("Ошибочная команда!");
				break;
		}
		String str = """
		Текстовые блоки упрощают работу с несколькими строками, потому что
			избавляют от необходимости использовать управляющие
			последовательности \n для обозначения новой строки.
			В результате текстовые блоки облегчают работу программиста!
		""";
		System.out.println(str);
	}
}

