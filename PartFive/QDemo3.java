/*
Упражнение 5.2.
Класс очереди для символов.
*/
class Queue3 {
	int [] q; // массив, хранящий данные очереди
	int putloc, getloc; // индексы для позиций помещения и извлечения
	Queue3(int size) {
		q = new int[size]; // выделение памяти под очередь
		putloc = getloc = 0;
	}
	// Поместить символ в очередь
	void put(int ch) {
		if(putloc==q.length) {
			System.out.println(" - Очередь переполнена.");
			return;
		}
		q[putloc++] = ch;
	}
	// Извлечь символ из очереди
	int get() {
		if(getloc == putloc) {
			System.out.println(" - Очередь пуста.");
			return 0;
		}
		return q[getloc++];
	}
}
// Демонстрация использования класса Queue
class QDemo3 {
	public static void main(String[] args) {
		Queue3 bigQ = new Queue3(100);
		Queue3 smallQ = new Queue3(4);
		int ch;
		int i;
		System.out.println("Использование bigQ для сохранения алфавита.");
		// Поместить в bigQ коды букв
		for(i=0; i < 110; i++)
			bigQ.put(i);
		// Извлечь и отобразить элементы bigQ.
		System.out.print("Содержимое bigQ: ");
		for(i=0; i < 110; i++) {
			ch = bigQ.get();
			if(ch != 0) System.out.print(ch+" ");
		}
		System.out.println("\n");
		System.out.println("Использование smallQ для генерации ошибок.");
		// Использовать smallQ для генерации ошибок.
		for(i=0; i < 5; i++) {
			System.out.print("Попытка сохранения " + (i));
			smallQ.put(i);
			System.out.println();
		}
		System.out.println();
		// Дополнительные ошибки в smallQ.
		System.out.print("Содержимое smallQ: ");
		for(i=0; i < 5; i++) {
			ch = smallQ.get();
			if(ch !=  0) System.out.print(ch+" ");
		}
	}
}
