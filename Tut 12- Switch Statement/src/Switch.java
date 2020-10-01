class Switch {
	public static void main(String args[]) {
		
		int age;
		age = 3;
				
		switch (age) {
		case 1: 
			System.out.println("You can crawl");
			break;
		
		case 2:
			System.out.println("You can talk");
			break;
		
		case 3:
			System.out.println("You can get in trouble");
			break;
		
		default:
			System.out.println("I don't know how old you are");
			break;
		}
	}
}
/**
switch statements are useful as they remove the need of you haveing to write lots 
of if statements*/