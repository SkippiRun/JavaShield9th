class Task_part_5{
	public static void main(String[] args){
		double [] arr = new double [10];
		int down = 1, up = 100;
		double sum = 0, avr = 0, count = 0;
		for(int i = 0; i < 10; i++){
			arr [i] = down + (int)((up - down+1)*Math.random());
			//System.out.println(arr[i]);
		}
		for (double i:arr){
			count++;
			sum += i;
			avr = sum/count;
			System.out.print("i = "+i+"\tcount = "+count+"\tsum = "+sum+"\tavr = "+avr+"\n");
		}
		System.out.println("\navr = "+avr);
	}
} 
