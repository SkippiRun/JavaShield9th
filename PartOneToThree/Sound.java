class Sound{
	public static void main(String[] args){
		double meters, speed, seconds;
		speed = 335;
		seconds = 7.2;
		seconds/=2;
		meters = speed * seconds;
		System.out.println("За " + seconds + " секунд, звук прошел расстояние, равное "
			+ meters + " метрам");
	}
}
