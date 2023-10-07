class Bobble{
	public static void main(String[] args){
		int [] nums = new int [10];
		int a, b, t, size = 0, min, max, down = -100, up = 100;
		for (int i = 0; i < 10; i++){
			nums [i] = down + (int)((up - down + 1)*Math.random());	
			System.out.print(nums[i]+" ");
			size++;
		}
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
	}
}
