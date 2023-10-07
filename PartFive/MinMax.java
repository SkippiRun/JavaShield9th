class MinMax{
	public static void main(String[] args){
		int [] nums = new int [10];
		int min, max, down = -100, up = 100;
		for (int i = 0; i < 10; i++){
			nums [i] = down + (int)((up - down + 1)*Math.random());	
			System.out.println(nums[i]);
		}
		min = max = nums[0];
		for (int i = 0; i < 10; i++) {
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
		}
		System.out.println("min = "+min+"\tmax = "+max);
	}
}
