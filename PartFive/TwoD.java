class TwoD{
	public static void main(String[] args){
		int size1 = 10, size2 = 10, down = 1, up = 100;
		int [] [] nums = new int [size1][size2];
		//int a, b, t, size = 0, min, max, down = -100, up = 100;
		for (int i = 0; i < size1; i++){
			for (int j = 0; j < size2; j++){
				nums [i][j] = down+(int)((up-down+1)*Math.random());
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}
}
