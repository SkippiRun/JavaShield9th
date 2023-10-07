class ExCycleFor{
	public static void main(String[] args){
		int num1, num2, sum1 = 0, sum2 = 0, down = -100, up = 100, size = 10;
		int [] nums1 = new int [size];
		int [] nums2 = new int [size];
		
		for (int i = 0; i < nums1.length; i++) nums1[i] = down + (int)((up - down + 1)*Math.random());
		for(int i: nums2) nums2[i] = down + (int)((up - down + 1)*Math.random());
		for (int i = 0; i < nums1.length; i++){
			sum1 += nums1[i];
		}
		System.out.println("sum1 = "+sum1);
		
		for(int i: nums2){
		       	sum2 += i;
		}
		System.out.println("sum2 = "+sum2);
	}
}

