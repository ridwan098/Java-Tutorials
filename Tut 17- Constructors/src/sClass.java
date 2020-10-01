public class sClass {
	private String girlName;
	
	
	//Below is the constructor variable
	//To make a constructor variable, the method has to be the
	//same name as the class., do not need to specify a type for the constructor
	public sClass(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first gf was %s\n", getName());
	}

}
