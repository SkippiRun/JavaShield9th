class MinMax2{
	public static void main(String[] args){
		int [] nums = { 99, -10, 123012, -1230, 932, 3, 213, -4, 23, -23};
		int min, max;
		min = max = nums[0];
		for (int i = 0; i < 10; i++) {
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
		}
		System.out.println("min = "+min+"\tmax = "+max);
	}
}
