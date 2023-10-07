class QueueS{
	int[] q;
	int putNum, getNum;

	QueueS(int size){
		q = new int[size];
		putNum = getNum = 0;
	}
	
	void put(int num){
		if (putNum == q.length){
			System.out.println("Full");
			return;
		}
		//System.out.println("put = "+putNum);
		q[putNum++] = num;
	}

	int get(){
		if (putNum == getNum){
			System.out.println("Empty");
			return 0;
		}
		//System.out.println("get = "+getNum);
		return q[getNum++];
	}


}
class QDemo2{
	public static void main(String[] args){	
		QueueS First = new QueueS(25);
		int num, i;
		for (i = 0; i < 26; i++){
			First.put(i);
		}
		for (i = 0; i < 26; i++){
			num = First.get();
			System.out.println(num);
		}
	}
}
