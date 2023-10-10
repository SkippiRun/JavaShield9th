class Bobble4{
	public static void main(String[] args){
	/*	String [] str = {"this", "is", "a", "test", "of", "a" , "string", "sort"};
		
		int i, j, size = str.length;
		String t;
		System.out.println("size = "+size);
		for (String q: str) System.out.print(q+" ");
		System.out.println();
		for (i = 1; i < size; i++){
			for (j = size-1; j >= i; j--){
				if (str[j-1].compareTo(str[j]) > 0){
					t = str[j-1];
					str[j-1] = str[j];
					str[j] = t;
				}
			}
		}
		for(String q: str) System.out.print(q+" ");
	
		System.out.println();
	*/	
	/*	int a, b, t, size = 0, min, max, down = -100, up = 100;
		System.out.println();
		for (a = 1; a < size; a++) {
			for (b = size-1; b >= a; b--){
				if (nums[b-1] > nums[b]){
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}
		for (int i = 0; i < size; i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n"+nums[size-2]);
	*/
	
	// Демонстрация пузырьковой сортировки для строк ,
		String[] strs = {
			"this", "is", "a", "test",
			"of", "a" , "string", "sort"
		};
		int a, b;
		String t;
		int size;
		size = strs.length; // количество сортируемых элементов
		// Отобразить исходный массив.
		System.out.print("Исходный массив:");
		for(int i=0; i < size; i++)
			System.out.print(" " + strs[i]);
		System.out.println();
		// Пузырьковая сортировка для строк.
		for(a = 1; a < size; a++)
			for(b=size-1; b >= a; b++) {
				if(strs[b-1].compareTo(strs[b]) > 0) { // Если порядок следования
				// не соблюден, тогда поменять элементы местами ,
				t = strs[b-1];
				strs[b-1] = strs[b];
				strs[b] = t;
				}
			}
		// Отобразить отсортированный массив.
		System.out.print("Отсортированный массив:");
		for(int i=0; i < size; i++)
			System.out.print(" " + strs[i]);
		System.out.println();
	}
}
