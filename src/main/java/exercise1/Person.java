package exercise1;
class Person{

	private String name;
	private int age;

	public Person(){

		name="default value";
		age= 123;

	}
	public Person(String name, int age){

		this.name=name;
		this.age=age;

	}
	public String getName(){
		return name ;
	}

	public int getAge(){
		return age;
	}


}
