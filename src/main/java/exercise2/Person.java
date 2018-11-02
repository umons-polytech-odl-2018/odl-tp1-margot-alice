package exercise2;

class Person {
	private int age;
	private static int populationsize=0;
	private static int totalAge=0;

	public Person(int age){
		this.age=age;
		populationsize++;
		totalAge+=age;
	}

	public static int computePopulationSize(){
		return populationsize;
	}
	public static float computeAveragePopulationAge(){
		return((float)totalAge/(float)populationsize);
	}
	public static void resetPopulation(){
		populationsize=0;
		totalAge=0;
	}
}


