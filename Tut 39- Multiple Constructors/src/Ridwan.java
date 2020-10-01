// This is from TUT 39 to 41
class Ridwan {
	public static void main(String[] args) {
		
		Ishola ridObject = new Ishola();
		Ishola ridObject2 = new Ishola(5);
		Ishola ridObject3 = new Ishola(5, 13);
		Ishola ridObject4 = new Ishola(5, 13, 43);
		
		System.out.printf("%s\n", ridObject.toMilitary());
		System.out.printf("%s\n", ridObject2.toMilitary());
		System.out.printf("%s\n", ridObject3.toMilitary());
		System.out.printf("%s\n", ridObject4.toMilitary());
	}
}
