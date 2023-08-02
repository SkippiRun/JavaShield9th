class MoonWeight{
	public static void main(String[] args){
		double weight, moonWeight, constMoon;
		constMoon = 0.17;
		weight = 80;
		moonWeight = weight*constMoon;
		System.out.println("Земной вес: " + weight + "\n" +
			 "Вес на луне: " + moonWeight);
	}
}
