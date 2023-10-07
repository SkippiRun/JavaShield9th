class Bobble2{
	public static void main(String[] args){
		int down = -100, up = 100, size = 30, t;
		int [] nums = new int [size];
		for (int i = 0; i < size; i++){
			nums [i] = down+(int)((up-down+1)*Math.random());
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size-1; j++){
				if (nums[j+1] < nums [j]){
					t = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = t;
					//System.out.println("#####\ti = "+i+"\tj = "+j);
				}
			}
		}
		for (int i = 0; i < size; i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
}

