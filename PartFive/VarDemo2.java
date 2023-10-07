// Использование выведения типов локальных переменных
// с классами, определенными пользователем.
class MyClass {
	private int i;
	MyClass(int k) { i = k; }
	int geti() { return i; }
	void seti(int k) { if(k >= 0) i = k; }
}
class VarDemo2 {
	public static void main(String[] args) {
		var me = new MyClass(10); // Обратите внимание на применение var.
		System.out.println ("Значение i в me равно " + me.geti() );
		me.seti(19);
		System.out.println ("Значение i в me теперь равно " + me.geti() );
	}
}
